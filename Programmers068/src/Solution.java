
public class Solution {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        for(int i=1; i<words.length; i++) {
        	if(words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)) {
        		answer[0] = (i+1)/n + 1;
        		answer[1] = (i+1)%n + 1;
        		break;
        	}
        }


        return answer;
    }
	public static void main(String[] args) {
		String[] w = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] result = solution(3,w);
		for(int i=0; i<2; i++)
			System.out.println(result[i]);
	}

}
