// [1차] 프렌즈4블록

public class Solution {
    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        boolean[][] erase;
        String[][] b = new String[m][n];
        boolean flag = true;
        
        for(int i=0; i<m; i++) {
    		b[i] = board[i].split("");
        }
        
        
        while(flag) {
        	flag = false;
        	erase = new boolean[m][n];
        	
        	// 1. 지워지는 블록 체크
            for(int i=0; i<m-1; i++) {
            	for(int j=0; j<n-1; j++) {
            		String s = b[i][j];
        			if(!s.equals(" ")&&s.equals(b[i][j+1])&&s.equals(b[i+1][j+1])&&s.equals(b[i+1][j])) {
        				erase[i][j] = true;
        				erase[i][j+1] = true;
        				erase[i+1][j+1] = true;
        				erase[i+1][j] = true;
        				
        				flag = true;
        			}
            	}
            }
            
            // 2. 블록 지우고 내리기
            if(flag) {
                for(int i=0; i<m; i++) {
                	for(int j=0; j<n; j++) {
                		if(erase[i][j]) {
                			if(i==0) b[i][j] = " ";
                			else {
                    			for(int k=0; k<i; k++) {
                    				b[i-k][j] = b[i-k-1][j];
                    				if(k==i-1) b[i-k-1][j] = " ";
                    			}
                			}

                			answer++;
                		}
                	}
                }
            }
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		String[] board = {"AABDE", "AAADE", "AAABF", "CCBBF"};
		String[] board2 = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		System.out.println(solution(6,6,board2));
	}

}
