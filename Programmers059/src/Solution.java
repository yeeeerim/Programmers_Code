import java.util.Arrays;

public class Solution {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i=0; i<phone_book.length-1; i++) {
        	if(phone_book[i+1].length()<phone_book[i].length()) continue;
        	if(phone_book[i+1].substring(0, phone_book[i].length()).equals(phone_book[i])) return false;
        }
        
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pb = {"119", "97674223", "1195524421"};
		System.out.println(solution(pb));
	}

}
