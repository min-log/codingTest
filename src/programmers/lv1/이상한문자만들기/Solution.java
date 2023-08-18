package programmers.lv1.이상한문자만들기;

import java.util.Iterator;
import java.util.Scanner;

public class Solution {
	
	//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
	//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	
    public int[] solution(long n) {
    	
       
        // 1. 입력 받은 숫자를 문자열로 변환
        String str = Long.toString(n);
        
        // 2. 변경된 문자열 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();
        
        // 3. 뒤집힌 문자열을 문자의 배열로 변환
        char[] strArr = reversed.toCharArray();
        int[] answer = new int[strArr.length];
        // 4. 배열의 각 문자를 정수로 변환
        for(int i=0;i<strArr.length;i++) {
        	answer[i] = strArr[i] - '0'; // -48 값 빼기
        }
        
        
        return answer;
    }
}
