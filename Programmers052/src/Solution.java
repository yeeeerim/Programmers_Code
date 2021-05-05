import java.util.ArrayList;

public class Solution {
    public static int solution(String s) {
        int answer = 0;
        int index = 0;
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        
        
        for(int i=1; i<s.length()/2; i++) {
        	for(int j=0; j<s.length()/i; j++) {
        		arr.add(s.substring(index, index+i));
        		index++;
        	}
        	for(int j=0; j<s.length(); j++) {
        		int cnt = 1;
        		String comp = arr.get(j);
        		while(arr.get(j+1).equals(comp)) {
        			cnt++; j++;
        			if(j==s.length()-1) break;
        		}
        		if(cnt==1) str+=comp;
        		else str=str+cnt+comp;
        	}
        	System.out.println(str);
        	return str.length();
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("aabbaccc"));
	}

}
