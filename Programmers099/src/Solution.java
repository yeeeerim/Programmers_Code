// 쿼드압축 후 개수 세기

public class Solution {
	static int zero_cnt = 0, one_cnt = 0;
    public static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        if(arr.length==1) {
        	answer[arr[0][0]]++;
        	return answer;
        }
        
		if(isSame(arr)==-1) compression(arr, arr.length);
		else if(isSame(arr)==0) zero_cnt++;
		else one_cnt++;
		
        answer[0] = zero_cnt;
        answer[1] = one_cnt;
        
        return answer;
    }
    
	private static void compression(int[][] arr, int n) {
		
		if(n==1) return;
		
		int[][] temp = new int[n/2][n/2];
		
		for(int k=0; k<4; k++) {
			for(int i=0, x=(k<2)?0:n/2 ; i<n/2; i++, x++) {
				for(int j=0, y = (k%2==0)?0:n/2; j<n/2; j++, y++) {
					temp[i][j] = arr[x][y];
				}
			}
			
			if(isSame(temp)==-1) compression(temp, n/2);
			else if(isSame(temp)==0) zero_cnt++;
			else one_cnt++;
		}
	}
	
	private static int isSame(int[][] temp) {
		int n = temp[0][0];
		
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				if(temp[i][j]!=n) return -1;
			}
		}
		
		return n;
	}
	public static void main(String[] args) {
		int[][] arr = {{0,0},{0,0}};
		int[] answer = solution(arr);
		for(int i=0; i<answer.length; i++)
			System.out.print(answer[i]+" ");
	}

}
