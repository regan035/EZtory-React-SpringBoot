package com.EZtory.application.restfulwebservices;

import java.util.Date;

public class Inventory {
	
	private long id;
	private String itemName;
	private String modelNumber;
	private String serialNumber;
	private String storageLocation;
	private double quantity;
	private String unit;
	private double unitValue;
	private double totalValue;
	private Date timeStamp;
	
	
	public Inventory() {
		
	}
	public Inventory(long id, String itemName, String modelNumber, String serialNumber, String storageLocation,
			double quantity, String unit, double unitValue, double totalValue, Date timeStamp) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.storageLocation = storageLocation;
		this.quantity = quantity;
		this.unit = unit;
		this.unitValue = unitValue;
		this.totalValue = totalValue;
		this.timeStamp = timeStamp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getUnitValue() {
		return unitValue;
	}
	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventory other = (Inventory) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
}
