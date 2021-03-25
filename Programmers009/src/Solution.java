import java.util.ArrayList;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> three = new ArrayList<>();
        
        while(true) {
        	three.add(n%3);
        	n/=3;
        	if(n==0) break;
        }
        
        for(int i=0; i<three.size(); i++) {
        	answer+=three.get(three.size()-1-i)*Math.pow(3, i);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(125));
	}

}
