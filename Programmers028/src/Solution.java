
public class Solution {
    public static int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	answer[s.length()-1-i] = Integer.parseInt(s.substring(i,i+1));
        }
        
        return answer;
    }
	public static void main(String[] args) {
		solution(12345);
	}

}
