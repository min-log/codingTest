package jungolEx;

import java.util.Iterator;
import java.util.Scanner;

public class Ex12_2_Star {
	// 반복제어문 3 - 자가진단 3
	// 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
		
		
		for(int i=0; i < 4;i++) { //4
			for(int j=3; j >= 0 ;j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();	
		}
		
		
		
		
	
		
	}
}
