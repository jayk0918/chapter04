package com.javaex.ex01;

public class CircleList {
	
	// 필드
	private Circle[] cArray;
	private int crtPos;
	
	// 생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}
	
	
	// 메소드 gs
	
	// 메소드 일반
	public void add(Circle circle) {
		cArray[crtPos] = circle;
		crtPos++;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}
	
	
	
}
