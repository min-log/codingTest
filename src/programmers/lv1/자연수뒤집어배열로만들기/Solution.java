package programmers.lv1.자연수뒤집어배열로만들기;

import java.util.Iterator;
import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] str =  s.toCharArray();
        String[] strList = {};
        int num=0;
        for(char i : str) {
        	if(i != ' ') strList[num] += i;
        	else num++;
        }
        
        

        StringBuilder sb = new StringBuilder(); 
        
        for(String t : strList) {
        	char[] txt = t.toCharArray();
        	for (int i= 1; i< txt.length; i++) {
				if(i % 2 == 0)sb.append(Character.toUpperCase(txt[i-1]));
				else sb.append(Character.toLowerCase(txt[i-1]));
			}
        }
        
        
        
        return answer = sb.toString();
        
        
    }
}