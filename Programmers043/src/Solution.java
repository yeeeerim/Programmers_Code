import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<d.length; i++) {
        	arr.add(d[i]);
        }
        Collections.sort(arr);
        
        for(int i=0; i<d.length; i++) {
        	sum+=arr.remove(0);
        	if(sum>budget) break;
        	answer++;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		System.out.println(solution(d,9));
	}

}
