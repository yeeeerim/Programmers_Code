
public class Solution {
	public static boolean solution(int x) {
        String s = x+"";
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
        	sum+=Integer.parseInt(s.substring(i,i+1));
        }
        if(x%sum==0) return true;
        return false;
    }
	public static void main(String[] args) {
		System.out.println(solution(10));
	}

}
