
public class Solution {
	
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int arr[] = new int[n]; // 체육복 갯수 저장하는 배열
        
        for(int i=0; i<n; i++)
        	arr[i] = 1; // 1로 초기화
        
        for(int i=0; i<lost.length; i++) { // lost에 있으면 -1
        	arr[lost[i]-1]--;
        }
        for(int i=0; i<reserve.length; i++) { // reserve에 있으면 +1
        	arr[reserve[i]-1]++;
        }
        
        for(int i=0; i<n; i++) {
        	if(arr[i]==0) { // 현재 인덱스의 학생이 체육복이 없고
        		if(i!=0&&arr[i-1]==2) { // 현재 학생이 0번이 아니고, 이전 학생이 여분 체육복이 있다면
        			arr[i]++; arr[i-1]--; // 이전 학생이 빌려줌
        		} else if(i!=(n-1)&&arr[i+1]==2) { // 현재 학생이 끝번이 아니고, 다음 학생이 여분 체육복이 있다면 
        			arr[i]++; arr[i+1]--; // 다음 학생이 빌려줌
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
