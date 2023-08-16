package jungolEx;

import java.util.Scanner;

public class Ex05 {
	// 반복제어문 1 - 자가진단 2
	//100 이하의 양의 정수만 입력된다. 
	//while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 
	//출력하는 프로그램을 작성하시오.
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int a = 0; 
		int result = 0;
		while (a <= v) {
			result += a;
			a++;
		}
		System.out.println(result);
		
	}
}
