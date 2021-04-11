
public class Solution {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n>m) { // n이 작은 수가 되도록 변경
        	int temp = n;
        	n = m; m=temp;
        }
        
        for(int i=n; i>=0; i--) { // 최대공약수
        	if(n%i==0&&m%i==0) {
        		answer[0]=i; break;
        	}
        }
        
        for(int i=1; i<=n; i++) { // 최소공배수
        	int temp = i*m;
        	if(temp%n==0&&temp%m==0) {
        		answer[1]=temp; break;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] answer = new int[2];
		answer = solution(3,12);
		System.out.println(answer[0]+","+answer[1]);
	}

}
