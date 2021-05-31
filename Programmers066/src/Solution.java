
public class Solution {
    static boolean solution(String s) {
        int left_cnt=0, right_cnt=0;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.substring(i, i+1).equals("(")) left_cnt++;
        	else right_cnt++;
        	if(left_cnt-right_cnt<0) return false;
        }
        if(left_cnt==right_cnt) return true;
        else return false;
    }
	public static void main(String[] args) {
		System.out.println(solution("(())())("));
	}

}
