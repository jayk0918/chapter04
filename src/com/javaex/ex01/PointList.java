package com.javaex.ex01;

public class PointList {
	
	// 필드
	private Point[] pArray;
	private int crtPos; // crtPos(임의의 이름) -> '현재 위치'를 지칭하고자 만든 필드

	public PointList() {
		// 배열 3개 -> 원래는 만들지 않음
		pArray = new Point[3];
		crtPos = 0;
	}
	
	// 생성자
	
	// 메소드 gs
	
	// 메소드 일반
	public void add(Point point) {
		// 현재 배열 갯수에 +1
		// 기존배열의 내용은 그대로 복사
		// 마지막 방에 point를 대입
		
		pArray[crtPos] = point;
		crtPos = crtPos + 1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Point get(int index) {
		return pArray[index];
	}
	
	
	
	
}
