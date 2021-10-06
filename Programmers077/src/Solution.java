// 거리두기 확인하기

public class Solution {
    public static int[] solution(String[][] places) {
        int[] answer = new int[5];
        int n = 5;
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		for(int k=0; k<n; k++) {
        			if(places[j][k].equals("P")) {
        				if(isDis1(j,k)) { // 거리 1에 P가 있는가
        					answer[i] = 0;
        				} else if(isDis2(j,k)) { // 거리 2에 P가 있는가
        					if()
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[][] places = 
				{{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
				 {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
				 {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
				 {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
				 {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
		int[] answer = new int[5];
		answer = solution(places);
		
		for(int i=0; i<answer.length; i++)
			System.out.println(answer[i]);
	}
}
