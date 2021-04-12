
public class Solution {
    public static double solution(int[] arr) {
        double answer = 0;
        
        for(int k:arr) {
        	answer+=k;
        }
        
        return answer/arr.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		System.out.println(solution(arr));
	}

}
