package com.md_exercise.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.md_exercise.model.ShoppingCart;

class ShoppingCartUtilsTest {
	
	private final static String APPLE = "Apple";
	private final static String ORANGE = "Orange";
		
	@Test
	void calculateTotal_Null() {
		ShoppingCart cart = new ShoppingCart();
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.00", result);
	}

	@Test
	void calculateTotal_Empty() {
		ShoppingCart cart = new ShoppingCart();
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.00", result);
	}
	
	@Test
	void calculateTotal_AppleOnly() {
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(APPLE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.60", result);
	}
	
	@Test
	void calculateTotal_OrangeOnly() {
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(ORANGE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.25", result);		
	}
	
	@Test
	void calculateTotal_MixList() {
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(APPLE,APPLE,ORANGE,APPLE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£1.45", result);			
	}
	
	@Test 
	void calculateTotal_AppleOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(APPLE,APPLE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.60", result);			
	}
	
	@Test 
	void calculateTotal_ThreeAppleOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(APPLE,APPLE,APPLE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£1.20", result);			
	}
	
	@Test 
	void calculateTotal_OrangeOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(ORANGE,ORANGE,ORANGE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.50", result);			
	}
	
	@Test 
	void calculateTotal_FourOrangeOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(ORANGE,ORANGE,ORANGE,ORANGE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£0.75", result);			
	}
	
	@Test 
	void calculateTotal_MixOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(ORANGE,APPLE,ORANGE,APPLE,ORANGE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£1.10", result);			
	}
	
	@Test 
	void calculateTotal_DoubleAppleOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(ORANGE,APPLE,APPLE,APPLE,APPLE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£1.45", result);			
	}
	
	@Test 
	void calculateTotal_DoubleOrangeOffer(){
		ShoppingCart cart = new ShoppingCart();
		List<String> itemsToAdd = Arrays.asList(ORANGE,APPLE,ORANGE,ORANGE,ORANGE,ORANGE,ORANGE);
		
		cart.setItems(itemsToAdd);
		String result = ShoppingCartUtils.calculateTotal(cart);
		
		assertEquals("£1.60", result);			
	}

}
