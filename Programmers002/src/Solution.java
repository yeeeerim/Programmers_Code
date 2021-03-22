import java.util.ArrayList;
import java.util.Scanner;

class Solution {

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        int row = board.length;
        int col = board[0].length;
        
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(board[i][j]<0||board[i][j]>100) {
					System.out.println("board의 각 칸에는 0 이상 100 이하인 정수를 담아야됩니다.");
					System.exit(1);
				}
			}
		}
		if(row<5||row>30||col<5||row>30) {
			System.out.println("5x5 이상 30x30 이하로 입력해주세요.");
			System.exit(1);
		}
		if(moves.length<1||moves.length>1000) {
			System.out.println("moves 배열의 크기는 1이상 1,000이하입니다.");
			System.exit(1);
		}
		for(int i=0; i<moves.length; i++) {
			if(moves[i]<1||moves[i]>col) {
				System.out.println("moves 배열의 각 원소들의 값은 1이상이며 board 배열의 가로 크기 이하인 자연수여야 합니다.");
				System.exit(1);
			}
		}
        
        for(int i=0; i<moves.length; i++) {
        	int num = moves[i];
        	for(int j=0; j<board.length; j++) {
            	if(board[j][num-1] != 0) {
            		basket.add(board[j][num-1]);
            		board[j][num-1] = 0;
            		break;
            	}
        	}
        }
        
        for(int i=0;i<basket.size()-1; i++) {
        	if(basket.get(i)==basket.get(i+1)) {
        		basket.remove(i);
        		basket.remove(i);
        		answer+=2;
        		i=-1;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		int start = 2;
		int end = 0;
		int line = 0;
		int row=0, col=0;
		String input = scanner.nextLine();
		String in = "", moveIn = ""; // in: board에 들어갈 수, moveIn: moves에 들어갈 수
		
		for(int i=0; i<input.length()-1; i++) {
			if((input.charAt(i)+"").equals("]")&&(input.charAt(i+1)+"").equals("]")) {
				in = input.substring(0,i+2);
				moveIn = input.substring(i+4,input.length());
				break;
			}
		}
		
		int len = in.length();
		
		for(int i=2; i<len-1; i++) { // 열 수 세기
			if((in.charAt(i)+"").equals("]")) {
				col = (i)/3;
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
				start = end+4;
				String temp[] = s.split(", ");
				int oneLine[] = toIntArray(temp);
				board[line++] = oneLine;
			}
		}
		

		
		/* moveIn -> moves */
		moveIn = moveIn.substring(1, moveIn.length()-1);
		String temp[] = moveIn.split(", ");
		moves = toIntArray(temp);
		

		
		answer = solution(board, moves);
		System.out.print(answer);
		
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