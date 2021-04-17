
public class Solution {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int index = 0;
        for(int k : absolutes) {
        	if(signs[index++]==false) answer-=k;
        	else answer+=k;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, false, true};
		System.out.println(solution(absolutes, signs));
	}

}
