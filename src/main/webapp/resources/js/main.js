$(document).ready(function () {
          
	  $("#first_category").on( "click", function() {
	   	  $("#first_category").addClass("active");
	   	  $("#second_category").removeClass("active");
	   	  $("#third_category").removeClass("active");
	   	  $("#fourth_category").removeClass("active");
	   	  $("#fifth_category").removeClass("active");
	  	});
      $("#second_category").on( "click", function() {
    	  $("#first_category").removeClass("active");
    	  $("#third_category").removeClass("active");
    	  $("#fourth_category").removeClass("active");
    	  $("#fifth_category").removeClass("active");
    	  $("#second_category").addClass("active");
    	 
      });
      $("#third_category").on( "click", function() {
    	  $("#first_category").removeClass("active");
    	  $("#second_category").removeClass("active");
    	  $("#third_category").addClass("active");
    	  $("#fourth_category").removeClass("active");
    	  $("#fifth_category").removeClass("active");
      });
      $("#fourth_category").on( "click", function() {
    	  $("#first_category").removeClass("active");
    	  $("#second_category").removeClass("active");
    	  $("#third_category").removeClass("active");
    	  $("#fourth_category").addClass("active");
    	  $("#fifth_category").removeClass("active");
      });
      $("#fifth_category").on( "click", function() {
    	  $("#first_category").removeClass("active");
    	  $("#second_category").removeClass("active");
    	  $("#third_category").removeClass("active");
    	  $("#fourth_category").removeClass("active");
    	  $("#fifth_category").addClass("active");
      });
     
      
      
      
});





