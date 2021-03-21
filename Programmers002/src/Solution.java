import java.util.Scanner;

public class Solution {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String in = scanner.nextLine(); // board에 들어갈 수
		String moveIn = scanner.nextLine(); // moves에 들어갈 수
		int len = in.length();
		int start = 2;
		int end = 0;
		int line = 0;
		int row=0, col=0;
		
		for(int i=2; i<len-1; i++) { // 열 수 세기
			if((in.charAt(i)+"").equals("]")) {
				col = (i-1)/2;
				break;
			}
		}
		for(int i=2; i<len-1; i++) { // 행 수 세기
			if((in.charAt(i)+"").equals("]")) {
				row++;
			}
		}
		
		int[][] board = new int[row][col];
		int[] moves = new int[moveIn.length()];
		
		/* in -> board */
		for(int i=2; i<len-1; i++) {
			if((in.charAt(i)+"").equals("]")) {
				end = i;
				String s = in.substring(start, end);
				start = end+3;
				String temp[] = s.split(",");
				int oneLine[] = toIntArray(temp);
				board[line++] = oneLine;
			}
		}
		
		/* moveIn -> moves */
		moveIn = moveIn.substring(1, moveIn.length()-1);
		String temp[] = moveIn.split(",");
		moves = toIntArray(temp);
		
//		for(int i=0; i<row; i++) {
//			for(int j=0; j<col; j++) {
//				System.out.print(board[i][j]);
//			}
//			System.out.println();
//		}
		
		solution(board, moves);
		
	}
	
	
	/* 문자열 배열을 정수 배열로 변환해주는 함수 */
	private static int[] toIntArray(String[] temp) {
		int oneLine[] = new int[temp.length];
		for(int i=0; i<temp.length; i++) {
			oneLine[i] = Integer.parseInt(temp[i]);
		}
		return oneLine;
	}

}