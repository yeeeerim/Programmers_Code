import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int k:scoville) {
        	arr.add(k);
        }
        
        Collections.sort(arr);

        if(arr.get(0)>=K) return -1;
        while(arr.get(0)<K) {
        	answer++;
        	arr.add(arr.get(0)+arr.remove(1)*2);
        	arr.remove(0);
        	if(arr.size()==1&&arr.get(0)<K) return -1;
        	Collections.sort(arr);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] s = {2,3};
		System.out.println(solution(s,7));
	}

}
