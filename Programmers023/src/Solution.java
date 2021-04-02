
public class Solution {
    public static String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
        	if((s.charAt(i)+"").equals(" ")) answer+=" ";
        	else {
            	if((s.charAt(i)+n<123&&s.charAt(i)+n>96&&Character.isLowerCase(s.charAt(i)))||(s.charAt(i)+n<91&&s.charAt(i)+n>64&&Character.isUpperCase(s.charAt(i)))) {
                	answer += (char)(s.charAt(i)+n);
            	} else {
            		answer += (char)(s.charAt(i)+n-26);
            	}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(" aBZ",20));
	}

}
