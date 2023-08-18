package programmers.lv0.대소문자바꿔서출력하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chList =  str.toCharArray();
        
        for(int i= 0; i<chList.length;i++) {
        	
        	if(Character.isUpperCase(chList[i])) {
        		chList[i] = Character.toLowerCase(chList[i]);
        		
        	}else {
        		chList[i] = Character.toUpperCase(chList[i]);
        	}
        }
        System.out.println(chList);
        
        
        
 
        
    }
}