
public class Solution {
	
    public static int[] solution(int n) {
    	int max = (n*n+n)/2;
        int[] answer = new int[max];
        int[][] arr = new int[n][n];
        int cnt = 1;
        int start = 0, end = n;
        
        while(true) {
            for(int i=start; i<end; i++) { // 아래로
            	arr[i][start] = cnt++; System.out.println("↓"+(cnt-1));if(cnt>max) break;
            } if(cnt>max) break;
            for(int i=start+1; i<end; i++) { // 오른쪽으로
            	arr[end-1][i] = cnt++; System.out.println("→"+(cnt-1));if(cnt>max) break;
            } if(cnt>max) break;
            for(int i=end-2; i>start; i--) { // 대각선으로
            	arr[i][i] = cnt++; System.out.println("↖"+(cnt-1));if(cnt>max) break;
            } if(cnt>max) break;
            start++; end--;
        }

        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		System.out.print(arr[i][j]+"\t");
        	}
        	System.out.println();
        }
        
        
        int index = 0;
        for(int i=0; i<n; i++) {
        	for(int j=0; j<=i; j++) {
        		answer[index++] = arr[i][j];
        	}
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		int[] answer = solution(4);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
