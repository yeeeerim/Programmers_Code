import java.util.ArrayList;

public class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
        	arr.add((int)Math.ceil((100-progresses[i])/(double)speeds[i]));
        }
        
        int n=1;
        int max = arr.get(0);
        for(int i=1; i<arr.size(); i++) {
        	if(max < arr.get(i)) {
        		max = arr.get(i);
        		result.add(n);
        		n=1;
        	} else {
        		n++;
        	}
        	if(i==arr.size()-1) result.add(n);
        }
        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
        	answer[i] = result.get(i);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {96,99,98,97};
		int[] s = {1,1,1,1};
		
		int result[] = solution(p,s);
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
	}

}
