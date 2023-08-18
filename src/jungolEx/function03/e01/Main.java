package jungolEx.function03.e01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int v = 1;
	private static int funtion(int num){
		
		if(num == 0) return 0;
		System.out.print(v +" ");
		++v;
		return funtion(--num);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(0<= num && 50>= num) funtion(num);
		
	
        
	}
}
