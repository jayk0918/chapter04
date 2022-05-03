package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		// ArrayList = 범용
		ArrayList<Point> pList = new ArrayList<Point>();
		// List<Point> pList = new ArrayList<Point>(); -> List를 인터페이스 / ArrayList를 하위로 하여 섞어쓰기하면 활용성 증가
		
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = new Point(113,133);
		//Circle c01 = new Circle(5);
		Point p04 = new Point(56, 2);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		//pList.addAll(c01); -> generic<T>가 Point로 설정되었기 때문에 Circle은 담을 수 없음
		
		System.out.println(pList.size());
		System.out.println(pList.get(2).getX());
		System.out.println(pList.get(1).getY());
		System.out.println(pList.get(0).toString());
		
		pList.remove(1);	// 제거(방번호)
		pList.remove(p02);	// 실제로 방번호를 파악하기란 쉽지 않으므로 변수명으로 작성해 제거
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getX());
		}
		
		// for문의 다른 표현 법 (enhanced version)//
		for(Point p : pList) {		//for (클래스 + 변수명(그릇) : 전체(pList))
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		// 이 문법은 무조건 끝까지 출력결과가 나오며 중간 개입 불가능
		
		// p04를 2번째(방번호 [1])에 추가
		pList.add(p04);	// 맨 끝에 추가하는 방식
		pList.add(1,p04); // add ( (원하는 방번호) , (넣고자하는 변수) )
		
		System.out.println(pList.toString());
		// 여기서의 toString은 print처럼 가로로 출력됨
		// Point 클래스를 돌면서 정의된 toString을 발견하여 연산한 결과를 일괄적으로 출력하기 때문
		// toString에 대해 미리 정의해두지 않는다면 주소값 출력
		// 주의 : Point toString()과는 구분되어야 함
		
		
	}

}
