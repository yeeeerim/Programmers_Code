import java.util.ArrayList;
import java.util.Collections;

// 상호 평가

public class Solution {
	 public static String solution(int[][] scores) {
	        String answer = "";
	        int len = scores.length;
	        
	        
	        for(int i=0; i<len; i++) {
		        ArrayList<Integer> arr = new ArrayList<>();
	        	float sum = 0;
	        	boolean flag = true;
	        	int temp = scores[i][i];
	        	
	        	for(int j=0; j<len; j++) {
	        		arr.add(scores[j][i]);
	        	}
	        	Collections.sort(arr);
	        	
	        	if((temp==arr.get(0)&&temp!=arr.get(1))||temp==arr.get(len-1)&&temp!=arr.get(len-2)) flag=false;
	        	
	        	for(int j=0; j<len; j++) sum += arr.get(j);
        		if(!flag) {sum-=temp; sum/=(len-1);}
        		else sum/=len;
        		
        		if(sum>=90) answer+='A';
        		else if(sum>=80) answer+='B';
        		else if(sum>=70) answer+='C';
        		else if(sum>=50) answer+='D';
        		else answer+='F';
	        	
	        }
	        
	        return answer;
    }
	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		System.out.println(solution(scores));
	}

}
