
public class Solution {
    public static long solution(long n) {
        if(Math.sqrt(n)-(int)Math.sqrt(n)==0) {
        	return (long) Math.pow(Math.sqrt(n)+1, 2);
        } else {
        	return -1;
        }
    }
	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}

}
