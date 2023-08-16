package jungolEx.array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class arrayEx05 {
	// 배열 2 - 형성평가 5
	// 호석이네 학교는 6학년이 네 반이 있는데 각 반의 대표를 세 명씩 선발하여 제기차기 시합을 하였다. 

	//반별로 세 명이 제기를 찬 개수를 입력받아 
	// 각 반별로 제기를 찬 개수의 합계를 출력하는 프로그램을 작성하시오.
	//
	//(반드시 배열을 이용하고 입력후에 출력하는 방식으로 하세요.)
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int[][] c = new int[4][3];
		for(int i = 0; i < c.length;i++) {
			System.out.println((i+1) +"class? ");
			c[i][0] = in.nextInt();
			c[i][1] = in.nextInt();
			c[i][2] = in.nextInt();
		}
	
		
		for(int i =0;i<c.length;i++) {
			int total = 0;
			for(int j =0;j<c[0].length;j++) {
				total += c[i][j];
			}
			System.out.println((i+1)+ "class : " + total );
					
		}
	}
		
}
