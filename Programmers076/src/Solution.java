// 괄호 변환

public class Solution {
    public static String solution(String p) {
        String answer = "";
        String[] pair = new String[2];
        
        pair[0] = ""; pair[1] = "";
        
        while(true) {
        	
            pair = run(p); // 1,2번
            
            if(pair[1].length()==0&&pair[0].length()==0) break;
            
            if(isRight(pair[0])) {
            	answer+=pair[0];
            	p = pair[1];
            	
            	continue;
            } else {
            	String s = "(";
            	
            	//재귀
            	s += solution(pair[1]);
            	
            	s+=")";
            	
            	pair[0] = pair[0].substring(1, pair[0].length()-1);
            	for(int i=0; i<pair[0].length(); i++) {
            		if(pair[0].substring(i, i+1).equals("(")) s+=")";
            		else s+="(";
            	}
            	
            	answer+=s;
            	
            	break;
            }
        }

        
        return answer;
    }

	private static String[] run(String p) {
		int left_cnt=0, right_cnt=0;
		String u="", v="";
		String answer[] = new String[2];
		
		answer[0]=""; answer[1]="";
		
		// 1. 입력이 빈 문자열인 경우, 빈 문자열 반환
		if(p.length()==0) return answer;
		
		// 2. 문자열 p를 u, v로 분리
		for(int i=0; i<p.length(); i++) {
			if(p.substring(i, i+1).equals("(")) left_cnt++;
			else right_cnt++;
			if(left_cnt==right_cnt) {
				u = p.substring(0, i+1);
				v = p.substring(i+1, p.length());
				break;
			}
		}
		
		answer[0] = u;
		answer[1] = v;
		
		return answer;
	}

	private static boolean isRight(String u) {
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
		System.out.println(solution(")("));
		System.out.println(solution("()))((()"));
	}

}
