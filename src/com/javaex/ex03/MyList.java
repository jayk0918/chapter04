package com.javaex.ex03;

public class MyList<T>{
	// <T> : generic
	// object로 구성하면 너무 범용이기 때문에 메모리에 바로 올리지 않고 추후 올리는 방식을 채택
	// <T>라고 관례적으로 표현함
	
	// 필드
	private T[] oArray;	// object로 구성했을때 단점 : 이것저것 다 받아줌(너무 범용임)
	private int crtPos; // crtPos(임의의 이름) -> '현재 위치'를 지칭하고자 만든 필드

	public MyList() {
		// 배열 3개 -> 원래는 만들지 않음
		oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
	// 생성자
	
	// 메소드 gs
	
	// 메소드 일반
	public void add(T obj) {
		// 현재 배열 갯수에 +1
		// 기존배열의 내용은 그대로 복사
		// 마지막 방에 point를 대입
			
		oArray[crtPos] = obj;
		crtPos = crtPos + 1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}
}



//<T> : generic,
//object로 구성하면 너무 범용이기 때문에 메모리에 바로 올리지 않고 추후 올리는 방식을 채택
// <T>라고 관례적으로 표현함
