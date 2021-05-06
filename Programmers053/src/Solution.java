
public class Solution {
    public static String[] solution(String[] record) {
        String[] answer = {};
        
        for(int i=0; i<record.length; i++) {
        	String[] s = record[i].split(" ");
        	String uid = s[1];
        	boolean flag = false;
        	for(int j=0; j<i; j++) {
        		if(answer[j].split(" ")[0].equals(uid)) {
        			flag = true;
        		}
        	}
        	if(!flag) {
        		answer[i] = s[1]+" "+s[2]+" 님이 들어왔습니다.";
        	}

        	
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = solution(record);
		
		for(int i=0; i<answer.length; i++)
			System.out.println(answer[i]);
	}

}
