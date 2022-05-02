package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList<Point> pList = new MyList<Point>();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		
		System.out.println(pList.get(0).toString());
		pList.get(0).getX(); // 제너릭 상으로 Point 클래스로 시선을 확정시킴 -> 캐스팅이 불필요함
		
		for(int i=0; i<pList.size(); i++) {
			Point p = pList.get(i);
			System.out.println(p.getX());
		}
		
		///////// 원 관리 /////////
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(6);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.size());
		
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			System.out.println(cList.get(i).getRadius());
		}
		
		
		
	}

}
