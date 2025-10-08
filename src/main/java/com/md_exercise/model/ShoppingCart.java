package com.md_exercise.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<String> items;
	private double total;
	
	public ShoppingCart() {
		this.setItems(new ArrayList<>());
		this.total = 0d;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
