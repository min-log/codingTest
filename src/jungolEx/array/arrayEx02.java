package jungolEx.array;

import java.util.Random;
import java.util.Scanner;

public class arrayEx02 {
	// 배열 2 - 형성평가 2
	// 학생들의 점수를 입력을 받다가 0이 입력되면 
	// 그 때까지 입력받은 점수를 10점 단위로 구분하여 
	// 점수대별 학생 수를 출력하는 프로그램을 작성하시오. 
	// (1명도 없는 점수는 출력하지 않는다.)학생은 최대 100명이하이다.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		//({ 1,2 },{ 1,2 },...}
		int[][] array = new int[10][2];
		int x = 0;
		
		for(int i = 0 ; i < array.length ;i++) {
			x++;
			array[i][0] = x * 10;
		}
		
//		
//		
		int item = 1;
		
		do{
			System.out.println("입력 :");
			item = in.nextInt();	
			
			
			if(90 <= item && item < 100) {
				item = 90;
			}else if(80 <=  item && item < 90) {
				item = 80;
			}else if(70 <=  item && item < 80) {
				item = 70;
			}else if(60 <=  item && item < 70) {
				item = 60;
			}else if(50 <=  item && item < 60) {
				item = 50;
			}else if(40 <=  item && item < 50) {
				item = 40;
			}else if(30 <=  item && item < 40) {
				item = 30;
			}if(20 <=  item && item < 30) {
				item = 20;
			}else if(10 <=  item && item < 20) {
				item = 10;
			}
			
			for(int a = 0; a < array.length; a++) {
				
				if(array[a][0] == item) {
					array[a][1] += 1;
				}
				
			}
			
		}while (item != 0);
		

		for(int i=0;i < array.length ;i++) {
			if(!(array[i][1] == 0)) {
				for(int j=0;j < array[0].length ;j++) {	
					System.out.print(array[i][j]);
					if (j == 0) {
						System.out.print(" : ");	
					}else {
						System.out.print(" person");
					}
				}
				System.out.println("");
			}
			
		}
		
	
		
	}
}
