import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<array.length; i++) {
        	arr.add(array[i]);
        }

        for(int i=0; i<commands.length; i++) {
        	ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<array.length; j++) {
            	temp.add(arr.get(j));
            }
        	List<Integer> a = new ArrayList<>();
        	a = temp.subList(commands[i][0]-1, commands[i][1]);
        	Collections.sort(a);
        	answer[i] = a.get(commands[i][2]-1);
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		solution(array,commands);
	}

}
