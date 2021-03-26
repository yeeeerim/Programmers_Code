import java.util.ArrayList;

public class Solution {
    public static int solution(int[] nums) {
        int n = nums.length/2;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++) {
        	if(!arr.contains(nums[i]))
        		arr.add(nums[i]);
        }
        
        return Math.min(arr.size(),n);
    }

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}

}
