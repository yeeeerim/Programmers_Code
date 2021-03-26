import java.util.*;

public class Solution {
    public static String solution(String s) {
        String answer = "";
        ArrayList<Character> c = new ArrayList<>();
        int len = s.length();
      
        for(int i=0; i<len; i++) {
        	c.add(s.charAt(i));
        }
        Collections.sort(c);
        
        for(int i=0; i<len; i++) {
        	answer+=c.get(len-1-i);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}

}
