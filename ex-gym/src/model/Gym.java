package model;

import java.io.Serializable;

public class Gym implements Serializable {
	private String name, area;
	private int total;

	public Gym() {}
	public Gym(String name, String area, int total) {
		this.name = name;
		this.area = area;
		this.total = total;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getArea() { return area; }
	public void setArea(String area) { this.area = area; }

	public int getTotal() { return total; }
	public void setTotal(int total) { this.total = total; }


}
