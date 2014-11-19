package com.ServletCRUD.dataStorage;

import java.util.ArrayList;
import java.util.List;


import com.ServletCRUD.data.runningShoes;


public class DataStorage {
	
	
	private List<runningShoes> db = new ArrayList<runningShoes>();
	public int size=0;
	public void addShoe(runningShoes shoe){
		runningShoes newshoe = new runningShoes(shoe.getBrand(), shoe.getModel(), shoe.getFootType(), shoe.getRunnersWeight(), shoe.getPrice(), shoe.getColor());
		db.add(newshoe);
		
	}
	
	public List<runningShoes> getAllShoes(){
		return db;
	}
	public void deleteShoes(String id){
		for(runningShoes shoes : db){
			if((shoes.getId().toString()).equals(id)){
			db.remove(db.indexOf(shoes));
			break;
			}
			
		}
		
	}
	public void updateShoes(runningShoes shoes){
		System.out.print(shoes.getBrand());
		for(int i=0;i<db.size();i++){
			
			if(shoes.getId().equals(db.get(i).getId())){
				db.remove(i);
				db.add(i, shoes);
				break;
			}
			
			
		}
		
	}

}
