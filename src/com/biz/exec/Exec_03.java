package com.biz.exec;

import java.util.Random;

public class Exec_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		
		int intR = rnd.nextInt(10);
		
		System.out.println(intR);
		if(intR %2 ==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
