import java.util.ArrayList;
class Solution {
    public String solution(String new_id) {
         String answer = "";
        ArrayList<Character> id = new ArrayList<>();

        /* String->ArrayList ���� */
        for(int i=0; i<new_id.length(); i++) {
        	id.add(new_id.charAt(i));
        }
        
        /* 1�ܰ�) �빮��->�ҹ��� ���� */
        for(int i=0; i<id.size(); i++) {
        	if(Character.isUpperCase(id.get(i))) {
        		char c = id.remove(i);
        		c = Character.toLowerCase(c);
        		id.add(i, c);
        	}
        }
        
        /* 2�ܰ�) �ҹ���, ����, -, _, .�� ������ ��� ���� ���� */
        for(int i=0; i<id.size(); i++) {
        	if(id.get(i).equals('-')||id.get(i).equals('_')||id.get(i).equals('.')||(id.get(i)>=97&&id.get(i)<123)||(id.get(i)>=48&&id.get(i)<58)) {
        		continue;
        	} else {
        		id.remove(i);
        		i--;
        	}
        }
        
        /* 3�ܰ�) .�� 2�� �̻� ���ӵ� �κ��� �ϳ��� .�� ġȯ */
        for(int i=0; i<id.size()-1; i++) {
        	if(id.get(i).equals('.')) {
                i++;
        		while(id.get(i).equals('.')) {
        			id.remove(i);
        			if(i==id.size()) break;
        		}
        	}
        }
        
        /* 4�ܰ�) .�� ó���̳� ���� ��ġ�ϸ� ���� */
        if(id.size()!=0&&id.get(0).equals('.')) id.remove(0);
        if(id.size()!=0&&id.get(id.size()-1).equals('.')) id.remove(id.size()-1);
        
        /* 5�ܰ�) �� ���ڿ��̸� a�� ���� */
        if(id.size()==0) id.add('a');
        
        /* 6�ܰ�) ���̰� 16�� �̻��̸�, ù 15���� �����ϰ� ��� ����(�������� .�̸� .���� ����) */
        while(id.size()>=16) {
        	id.remove(15);
        }
        if(id.get(id.size()-1).equals('.')) id.remove(id.size()-1);
        
        /* 7�ܰ�) ���̰� 2�� ���϶��, id�� ������ ���ڸ� ���̰� 3�� �� ������ �߰� */
        if(id.size()<=2) {
	        while(id.size()<3) {
	        	id.add(id.get(id.size()-1));
	        }
        }

        /*ArrayList->String ��ȯ*/
        for(int i=0; i<id.size(); i++) {
        	answer+=id.get(i);
        }
        
        return answer;
    }
}