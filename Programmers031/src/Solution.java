import java.util.ArrayList;

public class Solution {
	 public static int[] solution(int[] arr) {
	        int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<>();
	        int min=arr[0];
	        int minIndex=0;
	        
	        if(arr.length==1) { // 배열 크기가 1이면 -1을 담아 리턴
	        	answer = new int[1];
	        	answer[0] = -1;
	        	return answer;
	        }
	        
	        // 배열 크기가 2 이상이면
	        for(int i=0; i<arr.length; i++) {
	        	list.add(arr[i]); // list에 담기
	        	if(min>arr[i]) {
	        		min=arr[i]; // min값과
	        		minIndex=i; // min의 index 찾기
	        	}
	        }
	        list.remove(minIndex); // 가장 작은 수 제거
	        answer = new int[list.size()];
	        
	        for(int i=0; i<list.size(); i++) {
	        	answer[i] = list.get(i);
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		solution(arr);
	}

}
