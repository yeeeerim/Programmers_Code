import java.util.ArrayList;

class Solution {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int num = answers.length; // 문제 수
        int cnt1=0, cnt2=0, cnt3=0; // 각각 맞은 갯수
        ArrayList<Integer> answer1 = new ArrayList<>(); // 1번이 찍는 방식
        ArrayList<Integer> answer2 = new ArrayList<>(); // 2번이 찍는 방식
        ArrayList<Integer> answer3 = new ArrayList<>(); // 3번이 찍는 방식
        ArrayList<Integer> ans = new ArrayList<>(); // 가장 많은 문제 맞춘 사람들
        
        // 1번 수포자
        for(int i=0; i<num; i++) {
        	answer1.add(i%5+1);
        	if(answer1.get(i)==answers[i]) cnt1++;
        }
        
        // 2번 수포자
        while(true) {
        	answer2.add(2); if(answer2.size()==num) break;
        	answer2.add(1); if(answer2.size()==num) break;
        	answer2.add(2); if(answer2.size()==num) break;
        	answer2.add(3); if(answer2.size()==num) break;
        	answer2.add(2); if(answer2.size()==num) break;
        	answer2.add(4); if(answer2.size()==num) break;
        	answer2.add(2); if(answer2.size()==num) break;
        	answer2.add(5); if(answer2.size()==num) break;
        }
        for(int i=0; i<num; i++) {
        	if(answer2.get(i)==answers[i]) cnt2++;
        }
        
        // 3번 수포자
        while(true) {
        	answer3.add(3); if(answer3.size()==num) break;
        	answer3.add(3); if(answer3.size()==num) break;
        	answer3.add(1); if(answer3.size()==num) break;
        	answer3.add(1); if(answer3.size()==num) break;
        	answer3.add(2); if(answer3.size()==num) break;
        	answer3.add(2); if(answer3.size()==num) break;
        	answer3.add(4); if(answer3.size()==num) break;
        	answer3.add(4); if(answer3.size()==num) break;
        	answer3.add(5); if(answer3.size()==num) break;
        	answer3.add(5); if(answer3.size()==num) break;
        }
        for(int i=0; i<num; i++) {
        	if(answer3.get(i)==answers[i]) cnt3++;
        }
        System.out.println(cnt1+","+cnt2+","+cnt3);
        
        // 맞힌 갯수 비교
        if(cnt1==cnt2&&cnt2==cnt3) {ans.add(1); ans.add(2); ans.add(3);}
        else if(cnt1==cnt2&&cnt2>cnt3) {ans.add(1); ans.add(2);}
        else if(cnt1==cnt3&&cnt3>cnt2) {ans.add(1); ans.add(3);}
        else if(cnt2==cnt3&&cnt2>cnt1) {ans.add(2); ans.add(3);}
        else if(cnt1>cnt2&&cnt1>cnt3) {ans.add(1);}
        else if(cnt2>cnt1&&cnt2>cnt3) {ans.add(2);}
        else if(cnt3>cnt1&&cnt3>cnt2) {ans.add(3);}
        
        answer = new int[ans.size()];
        for(int i=0; i<ans.size(); i++) {
        	answer[i]=ans.get(i);
        }
        
        return answer;
    }
    
    public static void main(String args[]) {
    	int a[] = {1,2,3,4,5};
    	solution(a);
    }
}