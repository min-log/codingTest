package jungolEx;

import java.util.Scanner;

public class Ex01 {

	//정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 
	//둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요.");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println(a);
		if(a < 0) {
			System.out.println("minus");
		}
		
	}
	
	
}
