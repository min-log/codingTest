package programmers.lv0.문자열겹쳐쓰기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char [] list1 =  my_string.toCharArray();
        char [] list2 =  overwrite_string.toCharArray();
        
   
        for(int i = 0; i < overwrite_string.length() ;i++) {
        	list1[i + s] = list2[i];
        }
        
        for (char i : list1) {
        	answer += i;
		}
       
        
        return answer;
    }
}