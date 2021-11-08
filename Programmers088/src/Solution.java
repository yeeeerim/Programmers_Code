
public class Solution {
    public static int solution(String name) {
        int answer = 0;
        int len = name.length();
        
        for(int i=0; i<len; i++) {
        	
        }
        return answer;
    }
    
    // c와 'A' 간의 차이를 구하는 함수
	private static int diff(char c) {
		return (c<77)?c-'A':c-89;
	}
	public static void main(String[] args) {
		System.out.println(solution("JEROEN"));
	}

}
