	package com.exhui.hessian.vo;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = 1L;

	private String color;
	
	private String name;
	
	private int money;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
