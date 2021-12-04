// n^2 배열 자르기

public class Solution {
    public static int[] solution(int n, long left, long right) {
    	int len = (int)right - (int)left + 1;
        int[] answer = new int[len];
        
        int k = 0;
        
        
        for(int i=(int)left/n; i<(int)right/n; i++) {
        	for(int j=(int)left%n; j<(int)right%n; j++) {
    			answer[k++] = (i<j)?j+1:i+1;
    			System.out.println(i+","+j);
        	}
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		int[] answer = solution(4,7,14);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
