
public class Solution {
	
    public static int[] solution(int n) {
    	int max = (n*n+n)/2;
        int[] answer = new int[max];
        int[][] arr = new int[n][n];
        int start_x = 0, start_y = 0;
        int end_x = n-1, end_y = n-1;
        int[][] move = {{0,1},{1,0},{-1,-1}};
        int x = 0, y = 0;
        
        int move_x = move[0][0], move_y = move[0][1];
        
        for(int i=1; i<=max; i++) {
        	arr[y][x] = i;
        	
        	if(x==start_x&&y==end_y) {
        		move_x = move[1][0]; move_y = move[1][1];
        	} else if(x==end_x&&y==end_y) {
        		move_x = move[2][0]; move_y = move[2][1];
        	} else if(x==start_x+1&&y==start_y+1) {
        		move_x = move[0][0]; move_y = move[0][1];
        		start_x++; start_y+=2;
        		end_x-=2; end_y--;
        	}
        	
        	x += move_x;
        	y += move_y;
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
		int[] answer = solution(6);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
