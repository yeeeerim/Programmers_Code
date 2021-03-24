
public class Solution {
    public static String solution(int a, int b) {
        String answer = "";
        String[] s = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        
        for(int i=0; i<a-1; i++) day+=month[i]; // 이전 달까지의 일 수 더하기
        day+=b; // 일 수 더하기
        day--; // 하루 빼기
        day%=7; // 일주일로 나눈 나머지
        answer = s[day];
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(5,24));
	}

}
