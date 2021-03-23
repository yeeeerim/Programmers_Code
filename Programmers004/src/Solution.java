import java.util.ArrayList;
class Solution {
    public String solution(String new_id) {
         String answer = "";
        ArrayList<Character> id = new ArrayList<>();

        /* String->ArrayList 변경 */
        for(int i=0; i<new_id.length(); i++) {
        	id.add(new_id.charAt(i));
        }
        
        /* 1단계) 대문자->소문자 변경 */
        for(int i=0; i<id.size(); i++) {
        	if(Character.isUpperCase(id.get(i))) {
        		char c = id.remove(i);
        		c = Character.toLowerCase(c);
        		id.add(i, c);
        	}
        }
        
        /* 2단계) 소문자, 숫자, -, _, .를 제외한 모든 문자 제거 */
        for(int i=0; i<id.size(); i++) {
        	if(id.get(i).equals('-')||id.get(i).equals('_')||id.get(i).equals('.')||(id.get(i)>=97&&id.get(i)<123)||(id.get(i)>=48&&id.get(i)<58)) {
        		continue;
        	} else {
        		id.remove(i);
        		i--;
        	}
        }
        
        /* 3단계) .이 2번 이상 연속된 부분을 하나의 .로 치환 */
        for(int i=0; i<id.size()-1; i++) {
        	if(id.get(i).equals('.')) {
                i++;
        		while(id.get(i).equals('.')) {
        			id.remove(i);
        			if(i==id.size()) break;
        		}
        	}
        }
        
        /* 4단계) .가 처음이나 끝에 위치하면 제거 */
        if(id.size()!=0&&id.get(0).equals('.')) id.remove(0);
        if(id.size()!=0&&id.get(id.size()-1).equals('.')) id.remove(id.size()-1);
        
        /* 5단계) 빈 문자열이면 a를 대입 */
        if(id.size()==0) id.add('a');
        
        /* 6단계) 길이가 16자 이상이면, 첫 15문자 제외하고 모두 제거(마지막이 .이면 .까지 제거) */
        while(id.size()>=16) {
        	id.remove(15);
        }
        if(id.get(id.size()-1).equals('.')) id.remove(id.size()-1);
        
        /* 7단계) 길이가 2자 이하라면, id의 마지막 문자를 길이가 3이 될 때까지 추가 */
        if(id.size()<=2) {
	        while(id.size()<3) {
	        	id.add(id.get(id.size()-1));
	        }
        }

        /*ArrayList->String 변환*/
        for(int i=0; i<id.size(); i++) {
        	answer+=id.get(i);
        }
        
        return answer;
    }
}