<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/ShopingCart.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<c:if test="${not empty cart}">
		<c:if test="${cart.size() == 0}">
			Nothing found in cart.
		</c:if>
		<c:if test="${cart.size() > 0}">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${cart}" var="item">
							<tr>
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="<c:url value="${item.productData.pictureUrl}" />" alt="..." class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">${item.productData.name}</h4>
										<p>${item.productData.description}</p>
									</div>
								</div>
							</td>
							<td id="Price-${item.productData.id}" data-th="Price">$${item.productData.price }</td>
							<td data-th="Quantity">
								<input id="quan-${item.productData.id}" type="number" min="1" class="form-control text-center" value="${item.quantity}" onclick="update(${item.productData.id})">
							</td>
							<td id="Subtotal-${item.productData.id}" data-th="Subtotal" class="text-center">$${item.productData.price * item.quantity}</td>
							<td class="actions" data-th="">
								<button type="button" class="btn btn-danger btn-sm" onclick="rem(${item.productData.id})">Remove</button>								
							</td>
						</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong>Total 1.99</strong></td>
						</tr>
						<tr>
							<td><a href="#" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong id="total">Total $${total}</strong></td>
							<td><a href="<c:url value='/order/checkout' />" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a></td>
						</tr>
					</tfoot>
				</table>
		</c:if>
	</c:if>
	<c:if test="${empty cart}">
		Nothing found in cart.
	</c:if>
</div>
		<script>
			function update(id) {
				var basePrice = parseFloat($('#Price-'+id).html().split('$')[1]);
				var q = $('#quan-'+id).val();

				$('#Subtotal-'+id).html('$' + (basePrice * q).toString());
				updateTotal();
				
				setQuantity(id, q);
			}
			
			function updateTotal() {
				var ts = $('td[id^="Subtotal-"]');
				var total = 0.0;
				
				for(var i = 0; i < ts.length; i++) {
					total = total + parseFloat(ts[i].innerHTML.split('$')[1]);
				}
				
				$('#total').html('Total $'+total);
			}
			
			function setQuantity(pId, q) {
				var data = {}
				data["productId"] = pId;
				data["quantity"] = q;
				
				$.ajax({
					type : "POST",
					url : "<c:url value='/cart/setQuantity' />",
					data : data,
					timeout : 100000,
					success : function(data) {
						console.log("SUCCESS: ", data);
					},
					error : function(e) {
						console.log("ERROR: ", e);
					}
				});
			}
			
			function rem(pId) {
				var data = {}
				data["productId"] = pId;
				
				$.ajax({
					type : "POST",
					url : "<c:url value='/cart/remove' />",
					data : data,
					timeout : 100000,
					success : function(data) {
						console.log("SUCCESS: ", data);
						location.reload();
					},
					error : function(e) {
						console.log("ERROR: ", e);
					}
				});
			}
		</script>
</body>
</html>