import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] matrix = new int[rows][columns];
        int num = 1;
        for(int i=0; i<rows; i++) {
        	for(int j=0; j<columns; j++) {
        		matrix[i][j] = num++;
        	}
        }
        
        for(int i=0; i<queries.length; i++) {
        	ArrayList<Integer> arr = new ArrayList<>();
        	int r1 = queries[i][0]-1, c1 = queries[i][1]-1;
        	int r2 = queries[i][2]-1, c2 = queries[i][3]-1;
        	
        	int temp = matrix[r1][c1]; arr.add(temp);
        	
        	for(int j=0; j<r2-r1; j++) { // 위로
        		matrix[r1+j][c1] = matrix[r1+j+1][c1];
        		arr.add(matrix[r1+j+1][c1]);
        	}
        	for(int j=0; j<c2-c1; j++) { // 왼쪽으로
        		matrix[r2][c1+j] = matrix[r2][c1+j+1];
        		arr.add(matrix[r2][c1+j+1]);
        	}
        	for(int j=0; j<r2-r1; j++) { // 아래로
        		matrix[r2-j][c2] = matrix[r2-j-1][c2];
        		arr.add(matrix[r2-j-1][c2]);
        	}
        	for(int j=0; j<c2-c1; j++) { // 오른쪽으로
        		matrix[r1][c2-j] = matrix[r1][c2-j-1];
        		arr.add(matrix[r1][c2-j-1]);
        	}
        	matrix[r1][c1+1] = temp;
        	Collections.sort(arr);
        	answer[i] = arr.get(0);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[][] q = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		int[] result = solution(6,6,q);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
	}

}
