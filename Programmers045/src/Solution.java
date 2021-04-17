
public class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String s1 = "", s2 = "";
        
        for(int k : arr1) {
        	String s = Integer.toBinaryString(k);
        	while(s.length()<n) {
        		s = "0"+s;
        	}
        	s1 += s;
        }
        for(int k : arr2) {
        	String s = Integer.toBinaryString(k);
        	while(s.length()<n) {
        		s = "0"+s;
        	}
        	s2 += s;
        }
        for(int j=0; j<n; j++) {
        	String temp="";
            for(int i=0; i<n; i++) {
            	if(s1.substring(i, i+1).equals("0")&&s2.substring(i, i+1).equals("0")) {
            		temp+=" ";
            	} else temp+="#";
            }
        	s1 = s1.substring(n);
        	s2 = s2.substring(n);
            answer[j] = temp;
        }
       
        return answer;
    }
	public static void main(String[] args) {
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
	}

}
