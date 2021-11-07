import java.util.*;

public class Solution {
	static HashSet<Integer> hs = new HashSet<>();
	
    public static int solution(String numbers) {
    	int[] arr = new int[numbers.length()];
    	
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = Integer.parseInt(numbers.substring(i, i+1));
    	}
        
        for(int i=1; i<=arr.length; i++) {
        	permutation(arr,0,arr.length,i);
        }

        return hs.size();
    }
    
    // 순열 구하는 함수
    // arr 배열에서 nCr을 구함
    private static void permutation(int[] arr,int depth, int n, int r) {
    	if(depth == r) {
    		int num = 0;
    		for(int i=0; i<r; i++) {
    			num += arr[i]*(Math.pow(10, r-i-1));
    		}
			if(isPrimeNum(num)==true) {
	    		hs.add(num);
			}
    		return;
    	}
    	
    	for(int i=depth; i<n; i++) {
    		swap(arr, depth, i);
    		permutation(arr, depth+1, n, r);
    		swap(arr, depth, i);
    	}
    	
    }

	// SWAP 함수
	private static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

	// 소수인지 확인하는 함수
	// 소수이면 true, 아니면 false를 리턴
	private static boolean isPrimeNum(int n) {
		if(n<2) return false;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("17"));
	}

}
