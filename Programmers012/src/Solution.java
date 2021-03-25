import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) // 나머지가 0이면 result에 삽입
        	if(arr[i]%divisor==0) result.add(arr[i]);
        Collections.sort(result);
        if(result.size()==0) result.add(-1);

        answer = new int[result.size()];
        
        for(int i=0; i<result.size(); i++) // result -> answer
        	answer[i] = result.get(i);
        
        return answer;
    }
	public static void main(String[] args) {
		
	}

}
