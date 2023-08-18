package jungolEx.function03.ex04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static int funtion(int num1){
		if(num1 == 0) return 0;
		return (num1%10)*(num1%10) + funtion(num1/10);
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		
		System.out.print(funtion(num1));
		
	
        
	}
}
