package jungolEx.array;

import java.util.Random;

public class arrayEx01 {
	// 배열 2 - 형성평가 1
	public static void main(String[] args) {
		Random r = new Random();
		//({ 1,2 },{ 1,2 },...}
		int[][] array = new int[6][2];
		
		for(int i=0;i < array.length ;i++) {
			array[i][0] = i + 1;
		}
		
		for(int i=0; i < 10;i++) {
			int item = r.nextInt(6)+1;
			for(int a = 0; a < array.length; a++) {
				if(array[a][0] == item) {
					array[a][1] += 1;
				}
				
			}
		}

		for(int i=0;i < array.length ;i++) {
			for(int j=0;j < array[0].length ;j++) {
				
				System.out.print(array[i][j]);
				
				if (j == 0) {
					System.out.print(" : ");	
				}
			}
			System.out.println("");
			
		}
		
	
		
	}
}
