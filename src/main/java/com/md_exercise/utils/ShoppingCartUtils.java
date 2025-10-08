package com.md_exercise.utils;

import java.util.List;

import com.md_exercise.model.ShoppingCart;

public class ShoppingCartUtils {
	
	private final static String APPLE = "Apple";
	private final static String ORANGE = "Orange";
	
	public static String calculateTotal(ShoppingCart cart) {
		List<String> items = cart.getItems();
		
		double total = 0;
		
		for(String item:items) {
			switch(item) {
			
				case APPLE: 
					total += 0.60; 
					break;
				
				case ORANGE:
					total += 0.25;
					break;
			}
		}
		
		return String.format("£%.2f", total);
	}
}
