package jungolEx.array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class arrayEx04 {
	// 배열 2 - 형성평가 4
	// 4행 3열의 배열을 선언하고 아래의 값으로 초기화 한 후 
	// 차례대로 출력한 후 배열의 모든 값을 더한 결과를 출력하는 프로그램을 작성하시오.
	//{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}}
	
	public static void main(String[] args) {
	
		
		int[][] array = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		int total = 0;
		
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<array[0].length;j++) {
				System.out.print(array[i][j] + " ");
				total += array[i][j];
			}
			System.out.println("");		
		}
		System.out.println(total);
	}
		
}
