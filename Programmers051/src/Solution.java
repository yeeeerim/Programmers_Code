import java.util.ArrayList;

public class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayList<Integer> ing = new ArrayList<>(bridge_length);
        int sum = truck_weights[0];
        int cnt = 2;
        int index=0;
        
        if(bridge_length==1) return truck_weights.length+1;
        if(truck_weights.length==1) return bridge_length+1;
        
        
        ing.add(truck_weights[index++]);
        
        for(int i=0; i<bridge_length-1; i++)
        	ing.add(0);
        
        while(index<truck_weights.length) {
        	cnt++;
        	ing.add(0,truck_weights[index]);
    		if(cnt>bridge_length) sum-=ing.get(bridge_length);
        	if(sum+truck_weights[index]<=weight) { // 다음 트럭이 다리에 올라올 수 있으면;
        		sum+=truck_weights[index++]; 
        	} else {
        		ing.remove(0);
        		ing.add(0,0);
        	}
        }
        
        return ing.size()+1;
    }
    public static void main(String args[]) {
    	int[] tw = {7,4,5,6};
    	System.out.println(solution(2,10,tw));
    }
}