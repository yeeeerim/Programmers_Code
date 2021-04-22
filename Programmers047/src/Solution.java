
public class Solution {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        String s = "";
        
        for(int i=0; i<dartResult.length(); i++) {
        	if(!dartResult.substring(i, i+1).equals("*")&&!dartResult.substring(i, i+1).equals("#")) {
        		s+=dartResult.substring(i,i+1);
        	}
        }
        
        int index=0;
        
        for(int i=0; i<s.length(); i+=2) {
        	int temp = Integer.parseInt(s.substring(i, i+1));
        	switch(s.substring(i+1, i+2)) {
	        	case "S": temp*=1; break;
	        	case "D": temp*=2; break;
	        	case "T": temp*=3; break;
        	}
        	arr[index++] = temp;
        }
        
//        for(int i=0;i<3;i++)
//        	System.out.println(arr[i]);
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T"));
	}

}
