package com.training.initial.vending_machine;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class VendingMachine {

	private static final int MIN_PRICE = 1;
	private static final int MAX_PRICE = 4;
	private List<String> snackList;
	private Map<String, Double> snackMap;
	private String[] snackNames = {"Twinkies", "Ding Dongs", "Snowballs"};
	private Random rng;
	
	public VendingMachine(){
		
		snackList = new ArrayList<String>();
		snackMap = new HashMap<String, Double>();
		rng = new Random();
		
		for (String snack:snackNames) {
			addSnack(snack);
		}
	}
	
	public void addSnack(String snack){
		snackList.add(snack);
	
		Double value = rng.nextInt(MAX_PRICE - MIN_PRICE) * rng.nextDouble();
		snackMap.put(snack, value);
	}
	
	public String getSnack(int index){
		return snackList.get(index);
	}
	
	public double getSnackPrice(String snack){
		return snackMap.get(snack);
	}
	
	public int getTotalSnacks(){
		return snackList.size();
	}
}
