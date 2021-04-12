
public class Solution {
    public static long solution(int num) {
        int cnt = 0;
        long n = num;
        
        for(int i=0; i<500; i++) {
        	if(n==1) return cnt;
        	if(n%2==0) n/=2;
        	else n=n*3+1;
        	cnt++;
        }
        
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(solution(626331));
	}

}
