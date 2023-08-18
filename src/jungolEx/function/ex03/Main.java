package jungolEx.function.ex03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static void arraySort(int in){
		int totalnum = in * in; //총개수
		for(int i=0;i < totalnum ;i++) { //4
			if(i % in == 0)System.out.println();
			System.out.print((i+1) + " ");
		}
	 
    }
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int num = n.nextInt(); 
		arraySort(num);
        
	}
}
