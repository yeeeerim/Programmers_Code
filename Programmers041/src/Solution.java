
public class Solution {
	public static boolean isPrimeNumber(int sum) {
		for(int i=2; i<sum/2; i++) {
			if(sum%i==0) return false;
		}
		return true;
	}
	public static int solution(int[] nums) {
	       int answer = 0;

	       for(int i=0; i<nums.length-2;i++) {
	    	   for(int j=i+1; j<nums.length-1;j++) {
	    		   for(int k=j+1; k<nums.length; k++) {
	    			   int sum = nums[i]+nums[j]+nums[k];
	    			   if(isPrimeNumber(sum)) answer++;
	    		   }
	    	   }
	       }

	        return answer;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,7,6,4};
		System.out.println(solution(nums));
	}

}
