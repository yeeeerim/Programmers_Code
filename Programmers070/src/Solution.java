
// 1단계 (숫자 문자열과 영단어)
public class Solution {
    public static int solution(String s) {
        int answer = 0;
        String answer_st = "";
        
        for(int i=0; i<s.length(); i++) {
        	if(!Character.isDigit(s.charAt(i))){
        		switch(s.substring(i, i+2)) {
        		case "ze" : answer_st += "0"; i+=3; break;
        		case "on" : answer_st += "1"; i+=2; break;
        		case "tw" : answer_st += "2"; i+=2; break;
        		case "th" : answer_st += "3"; i+=4; break;
        		case "fo" : answer_st += "4"; i+=3; break;
        		case "fi" : answer_st += "5"; i+=3; break;
        		case "si" : answer_st += "6"; i+=2; break;
        		case "se" : answer_st += "7"; i+=4; break;
        		case "ei" : answer_st += "8"; i+=4; break;
        		case "ni" : answer_st += "9"; i+=3; break;
        		}
        	} else {
        		answer_st += s.charAt(i);
        	}
        }
        answer = Integer.parseInt(answer_st);
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
	}

}
