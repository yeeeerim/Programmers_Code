import java.util.ArrayList;

public class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        ArrayList<Integer> tw = new ArrayList<>(truck_weights.length);
        ArrayList<Integer> ing = new ArrayList<>(bridge_length);
        int currentWeight = 0;
        
        if(bridge_length==1) return 2;
        if(truck_weights.length==1) return weight+1;
        
        for(int i=0; i<truck_weights.length; i++)
        	tw.add(truck_weights[i]);
        
        ing.add(1,tw.remove(0)); answer+=2;
        currentWeight+=truck_weights[0];
        
        int cnt=2;
        while(tw.size()!=0||ing.size()!=0) {
        	if(currentWeight+tw.get(0)<=weight&&cnt<=bridge_length) {
        		ing.add(tw.remove(0));
        	} else if(currentWeight+tw.get(0)>weight&&cnt<=bridge_length) {
        		ing.add(0);
        	} else if(cnt==bridge_length) {
        		
        	}
        	cnt++;
        }
        return answer;
    }
    public static void main(String args[]) {
    	int tw[] = {7,4,5,6};
    	System.out.println(solution(2,10,tw));
    }
}
