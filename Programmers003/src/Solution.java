import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int parLength = participant.length;
        int comLength = parLength-1;

        
        
        /* 알고리즘 */
        HashMap<String,String> c = new HashMap<>();
        
        for(int i=0; i<comLength; i++) {
        	c.put(completion[i],completion[i]);
        }

        
        for(int i=0; i<parLength; i++) {
        	if(c.containsKey(participant[i])) {
        		c.remove(participant[i]);
        	}else {
        		answer = participant[i];
        	}
        }
        
        
        return answer;
    }
}
