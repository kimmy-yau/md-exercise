package com.md_exercise.utils;

import java.util.List;

import com.md_exercise.model.ShoppingCart;

public class ShoppingCartUtils {
	
	private final static String APPLE = "Apple";
	private final static String ORANGE = "Orange";
	
	/**
	 * Calculates the total of the shopping cart
	 * Applies any applicable special offers
	 * @param cart
	 * @return total
	 */
	public static String calculateTotal(ShoppingCart cart) {
		List<String> items = cart.getItems();
		
		double total = 0;
		
		int appleCounter = 0;
		int orangeCounter = 0;
		
		for(String item:items) {
			switch(item) {
			
				case APPLE: 
					appleCounter++;
					
					//Exclude adding for every 2nd apple
					if(appleCounter % 2 > 0) {
						total += 0.60; 
					}
					break;
				
				case ORANGE:
					orangeCounter++;
					
					//Exclude adding for every 3rd orange
					if(orangeCounter % 3 > 0) {
						total += 0.25;
					}
					break;
			}
		}
		
		return String.format("£%.2f", total);
	}
}
