
public class Solution {
    public static String solution(int n) {
        String answer = "";
        while(true) {
        	answer+="��";
        	if(--n==0) return answer;
        	answer+="��";
        	if(--n==0) return answer;
        }
    }
	public static void main(String[] args) {
		System.out.println(solution(7));
	}

}
