// 예상 대진표

public class Solution {
	 public static int solution(int n, int a, int b){
	        for(int i=2; i<=n; i*=2) {
	        	if((a-1)/i==(b-1)/i) return (int)(Math.log(i)/Math.log(2));
	        }
	        return 0;
	}
	 
	public static void main(String[] args) {
		System.out.println(solution(8,4,7));
	}
}
