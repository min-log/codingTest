package jungolEx;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10 {
	// 반복제어문 3 - 자가진단 1
	// 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 
	// 합이 n 이상이면 
	// 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int sum=0;
		int num = 0;
		for(int i=1; sum < a;i++) {
			if(i % 2 != 0) {
				//System.out.println(i);
				num ++;
				sum += i;
			} 
			
		}
		System.out.print(num + " " +sum);
	
		
	}
}
