
public class Solution {
    public static int solution(int n) {
        int answer = n+1;
        int n_cnt = count(n);
        int answer_cnt = count(answer);
        
        while(true) {
        	answer_cnt=count(answer);
        	if(answer_cnt==n_cnt) break;
        	answer++;
        }
        
        return answer;
    }
    
	private static int count(int n) {
        int cnt = 0;
        String n_bs = Integer.toBinaryString(n);
        for(int i=0; i<n_bs.length(); i++) {
        	if(n_bs.substring(i, i+1).equals("1"))
        		cnt++;
        }
        return cnt;
	}

	public static void main(String[] args) {
		System.out.println(solution(78));
	}

}
