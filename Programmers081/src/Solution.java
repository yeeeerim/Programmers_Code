// N개의 최소공배수

class Solution {
    public int solution(int[] arr) {
        int n1 = arr[0];

        for(int i=1; i<arr.length; i++) {
            int n2 = arr[i];
            n1 = calc_LCM(n1, n2);
        }

        return n1;
    }

//     두 수의 최소공배수를 구하는 함수
    public int calc_LCM(int n1, int n2) {
        int answer = n1>n2?n1:n2;

        while(answer%n1!=0||answer%n2!=0) {
            answer++;
        }
        return answer;
    }
}