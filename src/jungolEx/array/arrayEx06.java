package jungolEx.array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class arrayEx06 {
	// 배열 2 - 형성평가 6
	// 예제를 보고 적당한 배열을 선언한 후 1행의 1열과 3열 5열을 각각 1로 초기화하고
	// 나머지는 모두 0으로 초기화 한 후 
	// 2행부터는 바로 위행의 왼쪽과 오른쪽의 값을 더하여 채운 후 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int[][] arrayList = new int[5][5];
		
		for(int i = 0; i < arrayList.length ;i++) {
			if(i%2 == 0) {
				arrayList[0][i] = 1;
			}else {
				arrayList[0][i] = 0;
			}
		}
		
		for(int i = 1;  i < arrayList.length;i++) {
			for(int j =0;j<arrayList[0].length;j++) {
				if(j == 0) {
					arrayList[i][j] =arrayList[i-1][j+1];
				} 
				else if(j == arrayList[0].length - 1) {
					arrayList[i][j] =arrayList[i-1][j-1];
				}
				else  {
					arrayList[i][j] = arrayList[i-1][j+1] + arrayList[i-1][j-1];
				}
			}
		}
		
		
		for(int i =0;i<arrayList.length;i++) {
			for(int j =0;j<arrayList.length;j++) {
				System.out.print(arrayList[i][j] + " ");
			}
			System.out.println("");
			
		}
	}
		
}
