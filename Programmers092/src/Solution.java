import java.util.*;

public class Solution {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>(); // 약수를 저장할 리스트
        int yellow_h = 0, yellow_w = 0;
        
        
        for(int i=1; i<=Math.sqrt(yellow); i++) {
        	if(yellow%i==0) list.add(i);
        }

        
    	while(true) {
    		yellow_h = list.remove(0);
    		yellow_w = yellow / yellow_h;
    		
    		if(brown == border(yellow_w, yellow_h)) {
    			answer[0] = yellow_w+2;
    			answer[1] = yellow_h+2;
    			return answer;
    		}
    	}
    }
	private static int border(int w, int h) {
		return (w+2)*(h+2)-w*h;
	}
	public static void main(String[] args) {
		int[] answer = solution(24,24);
		System.out.println(answer[0]+","+answer[1]);
	}

}
