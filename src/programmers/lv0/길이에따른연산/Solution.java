package programmers.lv0.길이에따른연산;


class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int leng = num_list.length;
        
        if(leng >= 11) {
        	answer=0;
        	for (int i : num_list) {
        		answer += i;
			}
        }else if(leng <= 10) {
        	answer=1;
        	for (int i : num_list) {
        		answer *= i;
			}
        }
        return answer;
    }
}