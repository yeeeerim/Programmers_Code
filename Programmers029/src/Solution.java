import java.util.*;

public class Solution {
    public static long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        List<Character> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++)
        	list.add(s.charAt(i));
        
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++) {
        	answer+=(Integer.parseInt(list.get(i)+"")*Math.pow(10, i));
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

}
