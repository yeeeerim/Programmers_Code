
public class Solution {
    public static long solution(long w, long h) {
        long answer = w*h;
        long cut = 0;
        if(w>h) {long temp = w; w=h; h=temp;}
        for(int i=1; i<=w; i++)
        	cut+=Math.ceil((double)h*i/w) - Math.floor((double)h*(i-1)/w);
        return answer-cut;
    }
	public static void main(String[] args) {
		System.out.println(solution(11,8));
	}

}
