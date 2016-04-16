package com.training.initial.vending_machine;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {

	private List<String> snackList;
	//private Map snackMap;
	private String[] snackNames = {"Twinkies", "Ding Dongs", "Snowballs"};
	
	public VendingMachine(){
		
		snackList = new ArrayList<String>();
		//snackMap = new HashMap<>();
		
		for (String snack:snackNames) {
			addSnack(snack);
		}
	}
	
	public void addSnack(String snack){
		snackList.add(snack);
	}
	
	public String getSnack(int index){
		return snackList.get(index);
	}
	
	public int getTotalSnacks(){
		return snackList.size();
	}
}
