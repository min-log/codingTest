package jungolEx.function03.ex02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static void funtion(int num1){
		if(num1 == 0) {return;}
		else {
			System.out.println("recursive");
			funtion(--num1);
		}
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		funtion(num1);
	
        
	}
}
