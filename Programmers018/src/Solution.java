
public class Solution {
    public static boolean solution(String s) {
        if((s.length()==4||s.length()==6)) {
        	for(int i=0; i<s.length(); i++) {
        		if(!(s.charAt(i)>=48)||!(s.charAt(i)<59)) return false;
        	}
        	return true;
        } else return false;
    }
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}

}
