// 최소직사각형

public class Solution {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0, max2 = 0;

        
        // 1열에 더 큰 수가 오도록 배치
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][0]<sizes[i][1]) {
        		int temp = sizes[i][1];
        		sizes[i][1] = sizes[i][0];
        		sizes[i][0] = temp;
        	}
        }
        
        // 1, 2열에서 각각 가장 큰 수 찾기
        for(int i=0; i<sizes.length; i++) {
    		if(sizes[i][0] > max1) max1 = sizes[i][0];
    		if(sizes[i][1] > max2) max2 = sizes[i][1];
        }        
        
        answer = max1 * max2;
        
        return answer;
    }
	public static void main(String[] args) {
		int[][]	sizes = {{60,50},{30,70},{60,30},{80,40}};
		System.out.println(solution(sizes));
	}

}
