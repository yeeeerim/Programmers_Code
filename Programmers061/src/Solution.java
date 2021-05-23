
public class Solution {
    public static int solution(int[] citations) {
        int answer = citations.length;

        while(true) {
        	int cnt=0;
            for(int i=0; i<citations.length; i++) {
            	if(citations[i]>=answer) {
            		cnt++;
            	}
            }
            if(answer<=cnt) return answer;
            answer--;
            if(answer==0) return 0;
        }
    }
	public static void main(String[] args) {
		int[] c = {3,0,6,1,5};
		System.out.println(solution(c));
	}

}
