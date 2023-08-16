package jungolEx;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06 {
	// 반복제어문 1 - 자가진단 3
	//한 개의 정수를 입력받아 양수(positive integer)인지 
	// 음수(negative number)인지 출력하는 작업을 반복하다가 
	// 0이 입력되면 종료하는 프로그램을 작성하시오.
	//* 입출력예의 진한글씨는 출력값입니다.​
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean v = true;
		
		do {	
			System.out.println("number ? ");
			int a = in.nextInt();
			if(a > 0) System.out.println("positive integer");
			else if(a < 0 ) System.out.println("negative integer");
			else if(a == 0) v = false;
		} while (v);
	
		
	}
}
