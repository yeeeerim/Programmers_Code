// 로또의 최고 순위와 최저 순위

public class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int num = 6;
        int zero_cnt = 0;
        int right_cnt = 0;
        
        for(int i=0; i<num; i++) {
        	if(lottos[i]==0) {zero_cnt++; continue;}
    		for(int j=0; j<num; j++) {
    			if(lottos[i]==win_nums[j]) right_cnt++;
    		}
        }
        
        
        answer[0] = 7-((right_cnt+zero_cnt)==0?1:(right_cnt+zero_cnt));
        answer[1] = 7-(right_cnt==0?1:right_cnt);
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		int[] answer = solution(lottos, win_nums);
		for(int i=0; i<answer.length; i++) System.out.println(answer[i]);
	}

}
