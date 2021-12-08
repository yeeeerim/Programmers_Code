import java.util.Arrays;

// n^2 배열 자르기

public class Solution {
    public static int[] solution(int n, long left, long right) {
        int k = 0;
        int left_row = (int)left/n, left_column = (int)left%n;
        int right_row = (int)right/n, right_column = (int)right%n;
        int[] answer = new int[(right_row-left_row+1)*n];
        
        for(int i=left_row; i<=right_row; i++) {
        	for(int j=0; j<n; j++) {
    			answer[k++] = (i<j)?j+1:i+1;
        	}
        }
        
        return Arrays.copyOfRange(answer, left_column, (int)right - n*left_row + 1);
    }
	public static void main(String[] args) {
		int[] answer = solution(2,0,3);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
