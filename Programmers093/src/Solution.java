// 큰 수 만들기

public class Solution {
    public static String solution(String number, int k) {
        String answer = number;
        
        if(number.length()==k) return "";
        
        for(int i=0; i<k; i++) {
            int max = 0;
            int index = 0;
        	for(int j=0; j<answer.length(); j++) {
        		String temp = substr(answer, j);
        		int num = Integer.parseInt(temp);
        		
        		if(max<num) {
        			max = num;
        			index = j;
        		}
        	}
        	answer = substr(answer, index);
        }
        
        return answer;
    }
    
    
	private static String substr(String s, int i) {
		if(i==0) return s.substring(1, s.length());
		return s.substring(0, i) + s.substring(i+1, s.length());
	}


	public static void main(String[] args) {
		System.out.println(solution("00101", 3));
	}

}
