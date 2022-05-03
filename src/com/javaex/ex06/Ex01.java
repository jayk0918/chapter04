package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		// 로또 번호 랜덤뽑기
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(iSet.size()<6) {
			int nums = (int)(Math.random()*45)+1;
			iSet.add(nums);
		}
		
		for(Integer lotto : iSet) {
			System.out.print(lotto.toString() + "  ");
		}
		
		
	}
	
	
	
}
