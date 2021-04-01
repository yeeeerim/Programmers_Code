
public class Solution {
    public static int solution(String s) {
        int answer = 0;
        boolean plus = true;
        
        if((s.charAt(0)+"").equals("-")) {
        	s = s.substring(1);
        	plus = false;
        } else if((s.charAt(0)+"").equals("+")) {
        	s = s.substring(1);
        }

        char c[] = s.toCharArray();
        int d[] = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	d[i] = (int)c[i]-48;
        }
        for(int i=0; i<s.length(); i++) {
        	answer+=d[s.length()-i-1]*Math.pow(10, i);
        }
        if(!plus) {
        	answer = answer - (answer*2);
        }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("-1234"));
	}

}
