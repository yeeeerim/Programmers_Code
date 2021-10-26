import java.util.*;

class Solution {
    void pop(ArrayList<Integer> arr, int n) {
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i)==n) arr.remove(i);
        }
    }
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        ArrayList<Integer> x_arr = new ArrayList<>();
        ArrayList<Integer> y_arr = new ArrayList<>();

        for(int i=0; i<v.length; i++) {
            if(x_arr.contains(v[i][0])) {
                pop(x_arr, v[i][0]);
            } else {
                x_arr.add(v[i][0]);
            }
            
            if(y_arr.contains(v[i][1])) {
                pop(y_arr, v[i][1]);
            } else {
                y_arr.add(v[i][1]);
            }
        }

        answer[0] = x_arr.get(0);
        answer[1] = y_arr.get(0);
        
        return answer;
    }
}