import java.util.ArrayList;

public class Solution {
    public static int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        String s = "";
        ArrayList<Integer> starList = new ArrayList<>();
        ArrayList<Integer> sharpList = new ArrayList<>();
        
        for(int i=0; i<dartResult.length(); i++) {
        	if(!dartResult.substring(i, i+1).equals("*")&&!dartResult.substring(i, i+1).equals("#")) {
        		s+=dartResult.substring(i,i+1);
        	} else if(dartResult.substring(i, i+1).equals("*")) {
        		starList.add(i);
        	} else {
        		sharpList.add(i);
        	}
        }
        
        int index=0;
        
        for(int i=0; i<s.length(); i+=2) {
        	int temp = Integer.parseInt(s.substring(i, i+1));
        	if(Character.isDigit(s.charAt(i+1))){
        		temp = 10;
        		i++;
            	switch(s.substring(i+1, i+2)) {
	        	case "S": break;
	        	case "D": temp=(int)Math.pow(temp, 2); break;
	        	case "T": temp=(int)Math.pow(temp, 3); break;
        	}
        	arr[index++] = temp;
        	} else {
            	switch(s.substring(i+1, i+2)) {
	        	case "S": break;
	        	case "D": temp=(int)Math.pow(temp, 2); break;
	        	case "T": temp=(int)Math.pow(temp, 3); break;
            	}
            	arr[index++] = temp;
        		
        	}

        }
        
        // * 贸府
        for(int i=0; i<starList.size(); i++) {
        	int position = starList.get(i);
        	if(position==2||position==3) {
        		arr[0]*=2;
        	} else if(position==4||position==5) {
        		arr[0]*=2; arr[1]*=2;
        	} else {
        		arr[1]*=2; arr[2]*=2;
        	}
        }
        
        // # 贸府
        for(int i=0; i<sharpList.size(); i++) {
        	int position = sharpList.get(i);
        	if(position==2) {
        		arr[0]*=-1;
        	} else if(position==4||position==5) {
        		arr[1]*=-1;
        	} else {
        		arr[2]*=-1;
        	}
        }
        
        for(int i=0;i<3;i++)
        	answer+=arr[i];
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("1D2S#10S"));
	}

}
