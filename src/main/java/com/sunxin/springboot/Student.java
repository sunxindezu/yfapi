package com.sunxin.springboot;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Student {
	private int Id ;
	private String name ;
	private int score ;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
