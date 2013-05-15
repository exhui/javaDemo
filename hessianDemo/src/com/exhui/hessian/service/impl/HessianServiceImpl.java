package com.exhui.hessian.service.impl;

import com.exhui.hessian.service.HessianService;
import com.exhui.hessian.vo.Car;

public class HessianServiceImpl implements HessianService {

	private String name= "Hello, exhui";   
	
	@Override
	public String getName() {		
		return name;
	}

	@Override
	public Car getCar() {
		Car car = new Car();
		car.setColor("yellow");
		car.setMoney(12222222);
		car.setName("benz");
		return car;
	}

}
