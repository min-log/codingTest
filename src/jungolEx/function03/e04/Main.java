package jungolEx.function03.e04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int inx = 0;
	static int result = 0;
	private static int funtion(int num){
		System.out.println(num);
		String text = num + "";
		char[] strArr = text.toCharArray();
		int arrInx = strArr.length;
		if(strArr.length == 0) return result;
		 
		 int c = Integer.parseInt(strArr[inx] + "");
		 System.out.println(arrInx);
		 System.out.println("result : "+result);
		 result += c;
		 ++inx;
		 num = num /((10*(arrInx))/(arrInx));
		 System.out.println("num : "+num);
		return funtion(num);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(funtion(num));
		
	}
}
