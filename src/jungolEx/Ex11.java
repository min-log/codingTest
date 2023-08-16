package jungolEx;

import java.util.Iterator;
import java.util.Scanner;

public class Ex11 {
	// 반복제어문 3 - 자가진단 2
	// 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for(int i=0; i <= a;i++) {
			for(int j=0; j < i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	
		
	}
}
