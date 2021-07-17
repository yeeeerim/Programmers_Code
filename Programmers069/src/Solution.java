import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        List<String> arr = new ArrayList<>();
        int zero_cnt = 0;
        
        for(int i=0; i<s.length(); i++)
        	arr.add(s.substring(i, i+1));
        
        for(int i=0; i<arr.size(); i++) {
        	if(arr.get(i).equals("0")) {
        		arr.remove(i--);
        		zero_cnt++;
        	}
        }
      
//        1. 0 제거 + 갯수 COUNT
//        2. 2진수로 변환
//        
        
        answer[1] = zero_cnt;
        
        return answer;
    }
	public static void main(String[] args) {
		int[] answer = solution("110010101001");
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
