package com.javaex.ex07;

public class Point {
	
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드 gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//hashCode 재정의
	public int hashCode() {
		int hashCode = x + y;	// 위 식이 정교할수록 더 많은 필터링 가능
		return hashCode;
	}
	
	// equals()
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		boolean result;
		if((this.x == p.x) && (this.y == p.y)) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	
}
