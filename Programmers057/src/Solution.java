import java.util.ArrayList;

public class Solution {
    public static int solution(String s) {
    	ArrayList<Character> arr = new ArrayList<>();
    	for(int i=0; i<s.length(); i++)
    		arr.add(s.charAt(i));
    	
    	for(int i=0; i<arr.size()-1; i++) {
    		if(arr.get(i).equals(arr.get(i+1))) {
    			arr.remove(i); arr.remove(i);
    			if(i<1) i=-1;
    			else i-=2;
    		}
    	}
    	if(arr.size()==0) return 1;
    	return 0;
    }
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
	}

}
