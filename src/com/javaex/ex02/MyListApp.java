package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		
		pList.add(p01);
		pList.add(p02);
		
		System.out.println(pList.size());
		
		System.out.println(pList.get(0).toString());
		((Point)pList.get(0)).getX(); // pList상에서 없는 getX/Y를 구하기 위해 Point로 캐스팅
		
		for(int i=0; i<pList.size(); i++) {
			Point p = ((Point)pList.get(i));
			System.out.println(p.getX());
		}
		
		///////// 원 관리 /////////
		MyList cList = new MyList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(6);
		
		cList.add(c01);
		cList.add(c02);
		
		System.out.println(cList.size());
		
		
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
			Circle c = ((Circle)cList.get(i));
			System.out.println(c.getRadius());
		}
		
		
		
	}

}
