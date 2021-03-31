
public class Solution {
    public static String solution(int n) {
        String answer = "";
        while(true) {
        	answer+="¼ö";
        	if(--n==0) return answer;
        	answer+="¹Ú";
        	if(--n==0) return answer;
        }
    }
	public static void main(String[] args) {
		System.out.println(solution(7));
	}

}
