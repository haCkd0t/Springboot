package com.pika.pika.enitites;

public class load {
	private int Id;
	private String loadingPoint;
	private String UnloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private String weight;
	private int shipperId;
	private String comment;
	public load(int id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, String weight, int shipperId, String comment) {
		super();
		Id = id;
		this.loadingPoint = loadingPoint;
		UnloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.shipperId = shipperId;
		this.comment = comment;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return UnloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		UnloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "load [Id=" + Id + ", loadingPoint=" + loadingPoint + ", UnloadingPoint=" + UnloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", shipperId=" + shipperId + ", comment=" + comment + "]";
	}
	
}
