// 주식가격

public class Solution {
	
    public static int[] solution(int[] prices) {
    	int len = prices.length;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++) {
        	int sec = -1;
        	for(int j=i; j<len; j++) {
        		sec++;
        		if(prices[i]>prices[j]) break;
        	}
        	answer[i] = sec;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		int[] answer = solution(prices);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
