import java.util.ArrayList;

public class Solution {
    public static int solution(String s) {
        int index = 0;
        ArrayList<String> arr = new ArrayList<>();
        int minCnt = 1001;
        
        
        for(int i=1; i<=(s.length()==1?1:s.length()/2); i++) {
        	arr = new ArrayList<>();
            String str = "";
            index=0;
        	for(int j=0; j<Math.ceil((double)s.length()/i); j++) {
        		arr.add(s.substring(index, Math.min(index+i, s.length())));
        		index+=i;
        	}
        	for(int j=0; j<arr.size(); j++) {
        		int cnt = 1;
        		String comp = arr.get(j);
        		if(j==arr.size()-1) {
        			str+=comp;
        		} else {
            		while(arr.get(j+1).equals(comp)) {
            			cnt++; j++;
            			if(j==arr.size()-1) break;
            		}
            		if(cnt==1) str+=comp;
            		else str=str+cnt+comp;
        		}
        	}
        	if(minCnt>str.length()) minCnt = str.length();
        }
        
        return minCnt;
    }
	public static void main(String[] args) {
		System.out.println(solution("a"));
	}

}
