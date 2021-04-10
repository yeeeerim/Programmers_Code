class Location {
	int row=0;
	int col=0;
	Location(int row, int col){
		this.row=row; this.col=col;
	}
	void setLocation(int row, int col){
		this.row=row; this.col=col;
	}
}

public class Solution {
	static int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
	
	static int distance(Location hand, int num) {
		int r=0, c=0;
		
		for(int i=0; i<keypad.length; i++) {
			for(int j=0; j<keypad[i].length; j++) {
				if(keypad[i][j]==num) {
					r=i; c=j; break;
				}
			}
		}
		return Math.abs(r-hand.row)+Math.abs(c-hand.col);
	}
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        Location left = new Location(3,0); // �޼� ��ġ
        Location right = new Location(3,2); // ������ ��ġ
        
        for(int i=0; i<numbers.length; i++) {
        	if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
        		left.setLocation(numbers[i]/3, 0);
        		answer+="L";
        	} else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
        		right.setLocation(numbers[i]/3-1, 0);
        		answer+="R";
        	} else { // 2,5,8,0
        		int ld = distance(left,numbers[i]), rd=distance(right,numbers[i]);
        		System.out.println(i+": "+ld+"vs"+rd);
        		if(ld<rd) {
        			if(numbers[i]==0) left.setLocation(3, 1);
        			left.setLocation(numbers[i]/3, 1);
        			answer+="L";
        		} else if(ld>rd) {
        			if(numbers[i]==0) right.setLocation(3, 1);
        			right.setLocation(numbers[i]/3-1, 1);
        			answer+="R";
        		} else { // �Ÿ��� ���ٸ� hand ���
        			System.out.println("-");
        			if(hand.equals("right")) { // ����������
        				right.setLocation(numbers[i]/3-1, 1);
            			answer+="R";
        			} else { // �޼�����
            			left.setLocation(numbers[i]/3, 1);
            			answer+="L";
        			}
        		}
        	}
        }
        
        
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,3,4,5,8,2,1,4,5,9,5};
		System.out.println(solution(num,"right"));
	}

}
