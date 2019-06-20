package com.biz.exec;

import com.biz.exec.model.StudentVO;

public class Exec_08 {

	public static void main(String[] args) {
		
		StudentVO[] stdList = new StudentVO[10] ;
		
		int stLen = stdList.length;
		for (int i = 0; i < stLen; i++) {
			stdList[i] = new StudentVO();
		}
		
		stdList[0].number = "001";
		stdList[0].name = "홍길동";
		
		stdList[1].number = "002";
		stdList[1].name = "성춘향";


	}
}
