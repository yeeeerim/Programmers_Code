import java.util.ArrayList;

public class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayList<Integer> tw = new ArrayList<>(truck_weights.length);
        ArrayList<Integer> ing = new ArrayList<>(bridge_length);
        int sum = truck_weights[0];
        int cnt = 2;
        
        if(bridge_length==1) return 2;
        if(truck_weights.length==1) return weight+1;
        
        for(int i=0; i<truck_weights.length; i++)
        	tw.add(truck_weights[i]);
        
        ing.add(tw.remove(0));
        
        for(int i=0; i<bridge_length-1; i++)
        	ing.add(0);
        
        while(tw.size()!=0) {
        	cnt++;
        	ing.add(0,tw.get(0));
    		sum+=tw.get(0); if(cnt>bridge_length) sum-=ing.get(bridge_length);
        	if(sum<=weight) {
        		tw.remove(0);
        	} else {
        		sum-=tw.get(0);
        		ing.remove(0);
        		ing.add(0,0);
        	}
        }
        return ing.size()+1;
    }
    public static void main(String args[]) {
    	int tw[] = {7,4,5,6};
    	System.out.println(solution(2,10,tw));
    }
}
