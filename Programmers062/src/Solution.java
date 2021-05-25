
public class Solution {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr2[0].length; j++) {
            	int sum=0;
        		for(int k=0; k<arr1[0].length; k++) {
            		sum+=arr1[i][k]*arr2[k][j];
        		}
        		answer[i][j] = sum;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr1 = {{-1,4},{3,2}};
		int[][] arr2 = {{3,3,1},{3,3,1}};
		int[][] solution = solution(arr1,arr2);
		
		for(int i=0; i<solution.length; i++)
			for(int j=0; j<solution[i].length; j++)
				System.out.print(solution[i][j]+" ");
	}

}
