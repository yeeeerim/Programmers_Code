
public class Solution {
    public static boolean solution(String[] phone_book) {
        int len = phone_book.length;
        
        for(int i=0; i<len-1; i++) {
        	for(int j=i+1; j<len; j++) {
        		if(phone_book[i].length()<=phone_book[j].length()) {
        			if(phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) return false;
        		} else {
        			if(phone_book[i].substring(0, phone_book[j].length()).equals(phone_book[j])) return false;
            	}
        	}
        }
        
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pb = {"119", "97674223", "1195524421"};
		System.out.println(solution(pb));
	}

}
