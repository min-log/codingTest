package jungolEx.stack;

import java.util.Scanner;

public class stackEx01 {

	private static Scanner in;
	public static int[] result;
	
	public static void main(String[] args) {
		//https://jungol.co.kr/problem/1102
		
		in= new Scanner(System.in);
		
		
		// 스텍
		int stack1[] = new int[100];
		// 스텍 층 - 쌓인 데이터 수 채크 
		int nIndex =0;
		
		//명령어 수 
		int n = in.nextInt();
		//명령
		String cmd; 
		
		in.nextLine(); // 개행문자 제거
	
		
		for(int i=0; i < n ;i++) {
			
			cmd = in.nextLine(); 
			
			// insert
			if('i' == (cmd.toCharArray()[0])) {
				System.out.println("0");
				stack1[nIndex++] = cmd.toCharArray()[2];
				
			}
			// out
			else if("o".equals(cmd)) {
				System.out.println("1");
				if(nIndex == 0) System.out.println("empty");
				else System.out.println( stack1[--nIndex] );
				
			}
			//count 
			else if("c".equals(cmd)) {
				System.out.println("2");
				System.err.println(nIndex);
			}
			
		} // end for 
	}
}
