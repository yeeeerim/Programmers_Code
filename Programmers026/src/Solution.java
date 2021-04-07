import java.util.ArrayList;

public class Solution {
    public static String solution(String s) {
    	String answer="";
    	int index=0;
    	int i=0;
    	while(true) {
    		if((s.charAt(i)+"").equals(" ")) {
    			answer+=" ";
    			index=0;
    		} else {
            	if(index%2==0) answer+=Character.toUpperCase(s.charAt(i));
            	else answer+=Character.toLowerCase(s.charAt(i));
            	index++;
    		}
    		i++;
    		if(i==s.length()) break;
    	}
    	return answer;
    }
    public static void main(String args[]) {
    	System.out.println(solution("try     hello world   "));
    }
}
