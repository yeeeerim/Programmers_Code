import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int solution(int n) {
//        int cnt = 0;
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        
//        for(int i=3; i<=n; i++){
//            cnt = 0;
//            for(int j=0; j<arr.size(); j++){
//                if(i%arr.get(j)==0) { // ������ �������� �Ҽ��� ������
//                	cnt++; break;
//                }
//            }
//            if(cnt==0) {arr.add(i);};
//        }
//        return arr.size();
        int answer = 0;

        int[] filter = new int[n + 1];
        Arrays.fill(filter, 1);
        
        filter[0] = 0;
        filter[1] = 0;

        for (int i = 2; i < Math.sqrt(n) + 1; i++){

            if (filter[i] == 1){
                for (int j = i * 2; j <= n; j+=i){
                    filter[j] = 0;
                }
            }
        }

        for (int check: filter){
            if (check == 1){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
    	System.out.println(solution(10));
    }
}