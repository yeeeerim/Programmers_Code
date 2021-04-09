import java.util.ArrayList;

public class Solution {
	 public static int[] solution(int[] arr) {
	        int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<>();
	        int min=arr[0];
	        int minIndex=0;
	        
	        if(arr.length==1) { // �迭 ũ�Ⱑ 1�̸� -1�� ��� ����
	        	answer = new int[1];
	        	answer[0] = -1;
	        	return answer;
	        }
	        
	        // �迭 ũ�Ⱑ 2 �̻��̸�
	        for(int i=0; i<arr.length; i++) {
	        	list.add(arr[i]); // list�� ���
	        	if(min>arr[i]) {
	        		min=arr[i]; // min����
	        		minIndex=i; // min�� index ã��
	        	}
	        }
	        list.remove(minIndex); // ���� ���� �� ����
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
