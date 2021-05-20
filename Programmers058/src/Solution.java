
public class Solution {
    public static String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        String[] nums = new String[len];
        
        for(int i=0; i<len; i++)
        	nums[i]=numbers[i]+"";
        
        for(int i=0; i<len-1; i++) {
        	for(int j=i+1; j<len; j++) {
        		if(comp(nums[i],nums[j])<1) {
        			String temp = nums[i];
        			nums[i] = nums[j];
        			nums[j] = temp;
        		}
        	}
        }
        for(int i=0; i<len; i++) {
        	answer+=nums[i];
        }
        return answer;
    }
    
    private static int comp(String s1, String s2) {
    	if(s1.length()==s2.length()) {
			return s1.compareTo(s2);//길이 같으면 사전순으로
    	}
		if(s1.length()>s2.length()) {// 길이 비교
			return 1;
		} else {
			return -1;
		}
	}
    
	public static void main(String[] args) {
		int[] n = {6,10,2};
		System.out.println(solution(n));
		System.out.println("321".compareTo("3"));
	}


}
