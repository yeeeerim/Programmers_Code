
public class Solution {
    public static String solution(String s) {
        String answer = s.toLowerCase();
        boolean check = true;
        
        for(int i=0; i<answer.length(); i++) {
        	while(answer.charAt(i)==32) {
        		check=true;
        		if((i++)==answer.length()-1) return answer;
        	}
        	if(check&&answer.charAt(i)>=97&&answer.charAt(i)<=122) {
        		answer = answer.substring(0, i) + answer.substring(i, i+1).toUpperCase() + answer.substring(i+1);
        	}
        	check = false;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed  me "));
		System.out.println(solution("for the last week"));
	}

}
