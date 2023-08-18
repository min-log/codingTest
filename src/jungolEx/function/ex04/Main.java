package jungolEx.function.ex04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static int arraySort(int num1,int num2,int num3){
		// 1. 새개의 수를 받아 배열로 변경
		int[] arr = new int[3];
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		//2. 정렬을통해 가장 마지막 배열이 큰 숫자가 되도록
		Arrays.sort(arr);
	
		//3. 큰 숫자 전달
		return arr[2];
	 
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		int num2 = n.nextInt();
		int num3 = n.nextInt();
		int result = arraySort(num1,num2,num3);
		System.out.println(result);
        
	}
}
