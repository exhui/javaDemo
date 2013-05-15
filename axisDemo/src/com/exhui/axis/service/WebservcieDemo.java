package com.exhui.axis.service;

public class WebservcieDemo {

	private int requestCount = 0;

	public String helloWorld(String name) {
		requestCount++;
		System.out.println("requestCount=" + requestCount);
		System.out.println("Received £º" + name);
		return "Hello:" + name;
	}

	public String getName(String name) {
		return "hello " + name;
	}
	
}
