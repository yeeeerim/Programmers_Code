import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String,String> hm = new HashMap<String,String>();
        
        for(int i=0; i<record.length; i++) {
        	String[] s = record[i].split(" ");
        	if(!s[0].equals("Leave")) {
        		hm.put(s[1], s[2]);
        	}
        }
        
        for(int i=0; i<record.length; i++) {
        	String[] s = record[i].split(" ");
        	if(s[0].equals("Enter")) {
        		arr.add(hm.get(s[1])+"님이 들어왔습니다.");
        	} else if(s[0].equals("Leave")) {
        		arr.add(hm.get(s[1])+"님이 나갔습니다.");
        	}
        }
        answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = solution(record);
		
		for(int i=0; i<answer.length; i++)
			System.out.println(answer[i]);
	}

}
