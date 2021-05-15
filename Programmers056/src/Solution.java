
public class Solution {
    public static long solution(int w, int h) {
        long answer = (long)w*h;
        if(w>h) {int temp = w; w=h; h=temp;}
        double slope = (double)h/w;
        for(int i=1; i<=w; i++)
        	answer-=Math.ceil(slope*i) - Math.floor(slope*(i-1));
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(11,8));
	}

}
