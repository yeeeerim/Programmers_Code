import java.util.*;

public class Solution implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		String temp1 = s1+s2, temp2 = s2+s1;
		
		return temp2.compareTo(temp1);
	}
	
    public static String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        String[] nums = new String[len];
        int sum = 0;
        
        for(int i=0; i<len; i++) {
        	nums[i]=numbers[i]+"";
        	sum+=numbers[i];
        }
        
        Arrays.sort(nums, new Solution());
        
        if(sum==0) return "0";
        
        for(int i=0; i<len; i++) {
        	answer+=nums[i];
        }
        return answer;
    }
    
	public static void main(String[] args) {
		int[] n = {3,30,34,5,9};
		System.out.println(solution(n));
	}



}
