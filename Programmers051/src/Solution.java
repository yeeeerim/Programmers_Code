import java.util.ArrayList;

public class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        ArrayList<Integer> tw = new ArrayList<>(truck_weights.length);
        ArrayList<Integer> ing = new ArrayList<>(bridge_length);
        for(int i=0; i<truck_weights.length; i++)
        	tw.add(truck_weights[i]);
        
        ing.add(tw.remove(0)); answer++;
        while(tw.size()!=0||ing.size()!=0) {
        	answer++;
        	if(ing.get(0)+tw.get(0)<=weight) {
        		ing.add(tw.remove(0));
        	} else {
        		ing.remove(0);
        	}
        }
        
        return answer;
    }
    public static void main(String args[]) {
    	int tw[] = {7,4,5,6};
    	System.out.println(solution(2,10,tw));
    }
}
