package rs.enjoying.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Cart {
	private List<CartEntry> entries;

	public Cart() {
		entries = new ArrayList<CartEntry>();
	}
	
	public List<CartEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<CartEntry> entries) {
		this.entries = entries;
	}
	
	public void add(CartEntry ce)
	{
		this.entries.add(ce);
	}
}