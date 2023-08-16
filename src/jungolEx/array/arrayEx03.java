package jungolEx.array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class arrayEx03 {
	// 배열 2 - 형성평가 3
	// 10 미만의 자연수 두 개를 입력받아서 
	//첫 번째 항과 두 번째 항을 입력받은 수로 초기화 시킨 후
	//세 번째 항부터는 전전항과 전항의 합을 구하여 
	//그 합의 1의 자리로 채워서 차례로 10개를 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		//({ 1,2 },{ 1,2 },...}
		int[] array = new int[10];
		boolean re = true;
		
		int i = 0;
		do{
			System.out.println("입력 : ");
			int txt = in.nextInt();
					
			if(1 <= txt && txt < 10) {
				array[i] = txt ;
				i++;
			}else {
				System.out.println("올바른 숫자를 다시 입력해주세요 .");				
			}
			
			if(i==2) re = false;
			
			
		}while(re);
		

		for(int a=2; a < array.length ;a++) {
			array[a] = array[a-1] + array[a-2];
		}
		
		for(int t=0; t < array.length ;t++) {
			if(array[t]>10) {
				int x = array[t] % 10;
				System.out.print(x + " ");
			}else {
				System.out.print(array[t] + " ");
			}
			
		}
		
		
		
	
		
	}
}
