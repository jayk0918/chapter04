package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// map : 값을 넣을 때 이름을 정해서 넣어줌
		// 여기서는 Point에 대한 이름을 결정해서 넣어주어야 함 (보통 String 사용)
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		// <  key,  value>
		Point p01 = new Point(3, 3);		
		Point p02 = new Point(5, 5);
		Point p03 = new Point(14, 32);
		
		pMap.put("정우성", p01);	// map에서는 add가 없고 put을 사용함
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("박명수").getX());
		
		// 같은 키 값으로 추가할 경우
		Point p04 = new Point(100, 200);
		pMap.put("정우성", p04);
		System.out.println(pMap.toString()); // 같은 키 값을 넣을 경우 기존값을 replace
		
		// 전체 출력 (이름은 규칙이 없음)
		// 1. 키 목록을 생성 ["정우성", "이효리", "박명수"]
		// 2. pMap.get("키값(이름)")
		
		Set<String> keys = pMap.keySet(); // 키 목록을 set으로 관리
		System.out.println(keys.toString());
		
		for(String name : keys) {
			System.out.println(pMap.get(name).getX());
		}
		
		
	}

}
