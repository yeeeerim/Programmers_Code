import java.util.ArrayList;

public class Solution {
    public static int solution(String s) {
    	ArrayList<Character> arr = new ArrayList<>();
    	arr.add(s.charAt(0));
    	for(int i=1; i<s.length(); i++) {
    		if(arr.size()==0||arr.get(arr.size()-1)!=s.charAt(i)) {
    			arr.add(s.charAt(i));
    		} else arr.remove(arr.size()-1);
    	}
    	
    	if(arr.size()==0) return 1;
    	else return 0;
    }
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
	}

}
