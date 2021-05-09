import java.util.*;

public class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue q = new PriorityQueue();
        
        for(int k:scoville) {
        	q.add(k);
        }

        if((int)q.peek()>=K) return -1;
        while((int)q.peek()<K) {
        	answer++;
        	q.add((int)q.poll()+(int)q.poll()*2);
        	if(q.size()==1&&(int)q.peek()<K) return -1;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] s = {1, 2, 3, 9, 10, 12};
		System.out.println(solution(s,7));
	}

}
