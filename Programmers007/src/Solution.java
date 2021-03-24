
public class Solution {
	
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int arr[] = new int[n]; // ü���� ���� �����ϴ� �迭
        
        for(int i=0; i<n; i++)
        	arr[i] = 1; // 1�� �ʱ�ȭ
        
        for(int i=0; i<lost.length; i++) { // lost�� ������ -1
        	arr[lost[i]-1]--;
        }
        for(int i=0; i<reserve.length; i++) { // reserve�� ������ +1
        	arr[reserve[i]-1]++;
        }
        
        for(int i=0; i<n; i++) {
        	if(arr[i]==0) { // ���� �ε����� �л��� ü������ ����
        		if(i!=0&&arr[i-1]==2) { // ���� �л��� 0���� �ƴϰ�, ���� �л��� ���� ü������ �ִٸ�
        			arr[i]++; arr[i-1]--; // ���� �л��� ������
        		} else if(i!=(n-1)&&arr[i+1]==2) { // ���� �л��� ������ �ƴϰ�, ���� �л��� ���� ü������ �ִٸ� 
        			arr[i]++; arr[i+1]--; // ���� �л��� ������
        		}
        	}
        }
        
        for(int i=0; i<n; i++) {
        	if(arr[i]!=0) answer++;
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(solution(5,lost, reserve));
	}

}
