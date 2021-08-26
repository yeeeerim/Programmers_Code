// 부족한 금액 계산하기

public class Solution {
    public static long solution(int price, int money, int count) {
        long sum = 0;
        
        for(int i=0; i<count; i++) {
        	sum += price*(i+1);
        }

        return (money<sum)?sum-money:0;
    }
	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
	}

}