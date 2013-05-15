package com.exhui.axis.vo;

import java.util.Map;

public class PersonVO {
	
	private String name;
	private int age;
	private Map skill;
	private BookVO mybook;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map getSkill() {
		return skill;
	}

	public void setSkill(Map skill) {
		this.skill = skill;
	}

	public BookVO getMybook() {
		return mybook;
	}

	public void setMybook(BookVO mybook) {
		this.mybook = mybook;
	}
}
