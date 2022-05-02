package com.javaex.ex01;

public class CircleApp {

	public static void main(String[] args) {
		
		// list
		CircleList cList = new CircleList();
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(5);
		
		// list 추가
		cList.add(c1);
		cList.add(c2);
		
		// size
		System.out.println(cList.size());
		
		// 특정값 산출
		Circle c = cList.get(1);
		System.out.println(c.getRadius());
		
		// toString
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
	}

}
