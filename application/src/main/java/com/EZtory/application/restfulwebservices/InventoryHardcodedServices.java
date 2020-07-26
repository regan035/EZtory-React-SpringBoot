package com.EZtory.application.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class InventoryHardcodedServices {
	private static List<Inventory> inventory = new ArrayList();
	private static int idCounter = 0;
	
	static {
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
		inventory.add(new Inventory(++idCounter,"item00x","A002","0102","L2",1,"each",100,100,new Date()));
	}
	
	public List<Inventory> findAll(){
		return inventory;
		
	}
	
	public Inventory save(Inventory inventoryX) {
		if(inventoryX.getId()==-1 || inventoryX.getId()==0) {
			inventoryX.setId(++idCounter);
			inventory.add(inventoryX);
		} else {
			deleteById(inventoryX.getId());
			inventory.add(inventoryX);
		}
		return inventoryX;
	}
	
	public Inventory deleteById(long id) {
		Inventory inventoryX = findById(id);
		if(inventoryX==null)return null;
		if(inventory.remove(inventoryX)) {
			return inventoryX;
		}
		return null;
	}

	public Inventory findById(long id) {
		for(Inventory inventoryX:inventory) {
			if(inventoryX.getId()==id) {
				return inventoryX;
			}
		}
		return null;
	}


}
