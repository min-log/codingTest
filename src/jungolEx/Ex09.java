package jungolEx;

import java.util.Iterator;
import java.util.Scanner;

public class Ex09 {
	// 반복제어문 2 - 자가진단 1
	//문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.​
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		for(int i=0; i < 20;i++) {
			System.out.print(a);
		}
	
		
	}
}
