package com.biz.exec;

import com.biz.exec.model.StudentVO;

public class Exec_07 {

	public static void main(String[] args) {

		
		// StudentVO studentVO = null; 
		// null로 초기화를 하는것은
		// 문법오류를 잠시 보류하는 효과를 낸다
		StudentVO studentVO ;
		studentVO = new StudentVO();
		
		studentVO.number ="001";
		studentVO.name = "홍길동";
		
		
		
	}

}
