import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer,Double> fail = new HashMap<>(); // 스테이지 번호, 실패율 저장
        
        ArrayList<Integer> stgList = new ArrayList<>();
        for(int i=0; i<stages.length; i++)
        	stgList.add(stages[i]);
        Collections.sort(stgList);
        


        for(int i=0; i<N; i++) {
        	if(stgList.size()>0) {
            	int n=0; // 해당 스테이지를 못 깨고있는 유저의 수
            	while(stgList.get(0)==i+1) {
            		stgList.remove(0);
            		n++;
            		if(stgList.size()==0) break;
            	}
            	fail.put(i+1, (double)n/(double)(stgList.size()+n));
        	} else {
        		fail.put(i+1, 0.0);
        	}
        }
        

        
        List<Integer> keySetList = new ArrayList<>(fail.keySet());
        Collections.sort(keySetList, (o1,o2)->(fail.get(o2).compareTo(fail.get(o1)))); // 실패율 기준 내림차순 정렬
        
        
        int index = 0;
        for(Integer key : keySetList) {
        	answer[index++] = key;
		}
        
        
        return answer;
    }
	public static void main(String[] args) {
		int[] stages = {2,1,2,3,2,3,3,3};
		int[] result = solution(5,stages);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]);
		System.out.println();
		int[] stages2 = {4,4,4,4,4};
		int[] result2 = solution(4,stages2);
		for(int i=0; i<result2.length; i++)
			System.out.print(result2[i]);
	}

}
