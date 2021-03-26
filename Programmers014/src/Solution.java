import java.util.Arrays;

public class Solution {
    public static String[] solution(String[] strings, int n) {
        String temp = "";

        for(int i=0; i<strings.length; i++) {
        	strings[i] = strings[i].substring(n, n+1) + strings[i];
        }
        Arrays.sort(strings);
        for(int i=0; i<strings.length; i++) {
        	strings[i] = strings[i].substring(1);
        }
        return strings;
    }
	public static void main(String[] args) {
		String strings[] = {"sun","bed","car"};
		String answer[] = solution(strings, 1);
		for(int i=0; i<answer.length; i++)
			System.out.print(answer[i]+" ");
		
	}

}
