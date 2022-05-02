package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		
		Point[] pArray = new Point[3]; // 배열 : 개수를 정해야 함 -> 유연성 X
		Point p00 = new Point(2,2);
		Point p01 = new Point(12,13);
		Point p02 = new Point(22,23);
		
		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		
		////////////// Point 관리 //////////////
		// list
		PointList pList = new PointList();
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(12,14);
		
		// list 추가
		pList.add(p1);
		pList.add(p2);
		
		// size : list의 크기(Point의 개수)
		System.out.println(pList.size());
		
		// [1]방의 y값 산출
		Point p = pList.get(1);
		System.out.println(p.getY());
		
		// 전체 출력(toString)
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		////////////// Circle 관리 //////////////
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
