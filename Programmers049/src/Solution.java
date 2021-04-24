import java.util.ArrayList;

public class Solution {
    public static int solution(int[] priorities, int location) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<Integer> print = new ArrayList<>();
        ArrayList<Integer> print_order = new ArrayList<>();
        
        
        
        for(int i=0; i<priorities.length; i++) {
        	list.add(priorities[i]);
        	order.add(i);
        }
        
        
        for(int i=0; i<list.size()-1;) {
            boolean delay = false;
        	for(int j=i+1; j<list.size(); j++) {
        		if(list.get(i)<list.get(j)) {
        			list.add(list.remove(i));
        			order.add(order.remove(i));
        			delay=true;
        			break;
        		}
        	}
        	if(!delay) {
        		print.add(list.remove(i));
        		print_order.add(order.remove(i));
        	}
        }
        print.add(list.get(0));
        print_order.add(order.get(0));
        
        for(int i=0; i<print.size(); i++) {
        	if(print_order.get(i)==location) return i+1;
        }
        
        return -1;
    }
	public static void main(String[] args) {
		int[] p = {2,1,3,2};
		System.out.println(solution(p,2));
	}

}
