package programmers.lv0.문자열출력하기;

import java.util.Scanner;

public class Ex01 {
	
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //공백 제거 
        String s = sc.nextLine().trim().replace(" ","");
        //텍스트 길이 
        int sleng = s.length();
        if (1 <= sleng && sleng <=1000000) {
        	System.out.println(s);
		}
    }
}
