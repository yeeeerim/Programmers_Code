
public class Solution {
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        
        for(int i=0; i<Math.pow(2, numbers.length); i++) {
        	int sum = 0;
        	String bin = Integer.toBinaryString(i);
        	int binLength = bin.length();
        	for(int j=0; j<(numbers.length-binLength); j++) {
        		bin="0"+bin;
        	}
        	for(int j=0; j<numbers.length; j++) {
        		sum +=numbers[j]*(-1)*(Integer.parseInt(bin.substring(j, j+1))==0?-1:1);
        	}
        	if(sum==target) answer++;
        }
        return answer;
        
    }
	public static void main(String[] args) {
		int[] n = {1,1,1,1,1};
		System.out.println(solution(n,3));
	}

}
