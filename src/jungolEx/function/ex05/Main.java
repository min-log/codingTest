package jungolEx.function.ex05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static int funtion(int num1,int num2){
		int re=1;
		for(int i=0;i<num2;i++) {
			re *= num1;
		}
		return re;
	 
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		int num2 = n.nextInt();
		int result =0;
		if(num1 >= 0 && num2 >= 0 && num1 <= 10 && num2 <= 10) {
			result = funtion(num1,num2);
		}
		
		System.out.println(result);
        
	}
}
