package Programmers001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int[] solution(int[] numbers) {
    	ArrayList arr = new ArrayList();
    	
        int[] answer = {};
        int len=numbers.length;
        
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
            	int sum = numbers[i]+numbers[j];
            	if(!arr.contains(sum)) arr.add(sum); 
            }
        }
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
        	answer [i] = (int) arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        int len = (in.length()-1)/2;
        if(len<2||len>100) {
        	System.out.println("numbers의 길이는 2이상 100 이하입니다.");
        	System.exit(1);
        }
        int numbers[] = new int[len];
        
    	in = in.substring(1, in.length()-1);
    	String num[] = in.split(",");
    	for(int i=0; i<num.length; i++) {
    		numbers[i] = Integer.valueOf(num[i]);
    		if(numbers[i]<0||numbers[i]>100) {
    			System.out.println("numbers의 모든 수는 0이상 100 이하입니다.");
    			System.exit(1);
    		}
    	}
    	
        int answer[] = solution(numbers);

        System.out.print("[");
        for(int i=0; i<answer.length-1; i++) {
        	System.out.print(answer[i]+",");
        }	System.out.print(answer[answer.length-1]);
        System.out.print("]");
    }
}