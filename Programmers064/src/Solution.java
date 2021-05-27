
public class Solution {
    public static String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        for(String k : str) {
        	String temp = k.toLowerCase();
        	char first = temp.charAt(0);
        	if(first>=97&&first<=122) {
        		String uc = (first+"").toUpperCase();
        		temp = temp.substring(1, temp.length());
        		temp = uc+temp;
        	}
        	answer+=(temp+" ");
        }
        
        return answer.substring(0, answer.length()-1);
    }
	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
	}

}
