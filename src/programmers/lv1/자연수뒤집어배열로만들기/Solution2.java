package programmers.lv1.자연수뒤집어배열로만들기;

import java.util.Iterator;
import java.util.Scanner;

class Solution2 {
    public String solution(String s) {
    	StringBuilder sb = new StringBuilder(); 
    	
    	boolean toUpper = true;
    	
        for(char c : s.toCharArray()) {
        	if(!Character.isAlphabetic(c)) {
        		//공백처리
        		sb.append(c);
        		toUpper = true;
        	}else {
        		//알파벳처리
    			if(toUpper) {
    				sb.append(Character.toUpperCase(c));
    			}else {
    				sb.append(Character.toLowerCase(c));
    			}
    			toUpper = false;
        	}
        }
        return sb.toString();
       
    }
}