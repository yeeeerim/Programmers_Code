
public class Solution {
    public static String solution(String[] seoul) {
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) return "�輭���� "+i+"�� �ִ�";
        }
        return "";
    }
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		System.out.println(solution(seoul));
	}

}
