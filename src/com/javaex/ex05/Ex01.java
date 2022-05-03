package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// HashSet : 중복 저장 X -> hashCode(), equals()의 재정의가 필요함
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		// Integer i01 = new Integer (12);
		Integer i01 = 12;
		Integer i02 = 2;
		Integer i03 = 1;
		
		Integer i04 = 12;	// 중복값 실험
		Integer i05 = 8;
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		iSet.add(i04);
		iSet.add(i05);
		
		// iset.add(4);
		// boxing
		System.out.println(iSet.size());
		System.out.println(iSet.toString()); // 자체적으로 재정의함
		
		// 방번호의 개념 X, for문 enhanced version 사용 필수
		for(Integer num : iSet) {
			System.out.println(num.toString());
		}
		// 순서의 개념이 없으므로 출력도 입력순서와 무관하게 나옴
		
		
		
	}

}
