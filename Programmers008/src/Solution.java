
public class Solution {
    public static String solution(int a, int b) {
        String answer = "";
        String[] s = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;
        
        for(int i=0; i<a-1; i++) day+=month[i]; // ���� �ޱ����� �� �� ���ϱ�
        day+=b; // �� �� ���ϱ�
        day--; // �Ϸ� ����
        day%=7; // �����Ϸ� ���� ������
        answer = s[day];
        
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(5,24));
	}

}
