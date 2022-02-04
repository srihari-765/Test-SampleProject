package com.package2;

public class Mobiles implements Comparable<Mobiles>{
	private String company;
	private int cost;
	private int ram;
	private int cam;
	@Override
	public String toString() {
		return "Mobiles [company=" + company + ", cost=" + cost + ", ram=" + ram + ", cam=" + cam + "]";
	}
	public String getCompany() {
		return company;
	}
	public Mobiles(String company, int cost, int ram, int cam) {
		super();
		this.company = company;
		this.cost = cost;
		this.ram = ram;
		this.cam = cam;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCam() {
		return cam;
	}
	public void setCam(int cam) {
		this.cam = cam;
	}
	@Override
	public int compareTo(Mobiles o) {
		if(this.getCost()>o.getCost())
			return 200;
		else 
			return -200;
	}
	
}
