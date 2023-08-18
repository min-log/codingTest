package jungolEx.function03.ex03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int sum=0;
	
	private static void funtion(int num1){
		if(num1 == 0) {
			System.out.println(sum);
			return;
		}
		else {
			sum += num1;
			
			funtion(--num1);
		}
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		if(0<= num1&& num1 <= 100)funtion(num1);
	
        
	}
}
