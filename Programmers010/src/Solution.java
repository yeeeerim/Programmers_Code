
public class Solution {
	
    public static String solution(String s) {
        String answer = "";
        
        if(s.length()%2==1) {
        	answer = s.charAt(s.length()/2)+"";
        } else {
        	answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

}
