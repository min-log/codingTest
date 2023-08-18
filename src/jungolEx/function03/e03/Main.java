package jungolEx.function03.e03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int v = 1;
	static int result = 1;
	private static int funtion(int num){
		if(num == 0) return result;
		result *= v;
		++v;
		return funtion(--num);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(0<= num && 12>= num) System.out.println(funtion(num));
		
	}
}
