
public class Solution {
    public static String solution(int n) {
        String answer = "";
        while(n>0) {
        	switch(n%3) {
        	case 1: answer="1"+answer; break;
        	case 2: answer="2"+answer; break;
        	case 0: answer="4"+answer; break;
        	}
        	n--;
        	n/=3;
        }
        return answer;
    }
    public static void main(String args[]) {
    	System.out.println(solution(14));
    }
}