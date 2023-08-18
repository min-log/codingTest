package jungolEx.function03.ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static void funtion(int num1){
		if(num1 == 0) {return;}
		else {
			System.out.print(num1 + " ");
			funtion(--num1);
		}
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		if(0<= num1&& num1 <= 50)funtion(num1);
	
        
	}
}
