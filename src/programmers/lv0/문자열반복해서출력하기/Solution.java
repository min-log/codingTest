package programmers.lv0.문자열반복해서출력하기;

import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if (1 <= n && n <=5 && 1 <= str.length()&& 10 >= str.length()) {
        	for(int i=0;i<n;i++) {
        		System.out.print(str);
        	}
        }
        
    }
}