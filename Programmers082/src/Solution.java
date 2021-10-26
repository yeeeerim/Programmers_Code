// 피보나치 수

class Solution {
    public int solution(int n) {
        int div = 1234567;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=0; i<n-1; i++) {
            arr[i+2] = (arr[i] % div + arr[i+1] % div) % div;
        }
        
        return arr[n];

    }
}