// 괄호 변환

public class Solution {
    public static String solution(String p) {
        String answer = "";

        
        run(p);
        
       
        if(!isBalance(u)) {
        	String s = "(";
        	//재귀
        	s+=")";
        	u = u.substring(1, u.length());
        	for(int i=0; i<u.length(); i++) {
        		if(u.substring(i, i+1).equals("(")) s+=")";
        		else s+="(";
        	}
        }
        
        System.out.println(u+","+v);

        
        return answer;
    }

	private static String run(String p) {
		int left_cnt=0, right_cnt=0;
		String u="", v="";
		if(p.length()==0) return "";
		
		for(int i=0; i<p.length(); i++) {
			if(p.substring(i, i+1).equals("(")) left_cnt++;
			else right_cnt++;
			if(left_cnt==right_cnt) {
				u = p.substring(0, i+1);
				v = p.substring(i+1, p.length());
				break;
			}
		}
	}

	private static boolean isBalance(String u) {
		int stack = 0;
		
		for(int i=0; i<u.length(); i++) {
			if(u.substring(i, i+1).equals("(")) {
				stack++;
			} else stack--;
			if(stack<0) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(solution("(()())()"));
	}

}
