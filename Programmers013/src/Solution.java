
public class Solution {
    public static long solution(int a, int b) {
        long answer = 0;
        
        for(int i=(a<b?a:b); i<=(a<b?b:a); i++) {
        	answer+=i;
        }
        
        return answer;
    }
    public static void main(String args[]) {
    	System.out.println(solution(5,3));
    }
}
