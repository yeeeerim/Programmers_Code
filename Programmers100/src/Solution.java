import java.util.*;

public class Solution {
    public static String[] solution(int[][] line) {
        String[] answer = {};
        List<int[]> arr = new ArrayList<>();
        int min_y=0, max_y=0, min_x=0, max_x=0;
        
        for(int i=0; i<line.length-1; i++) {
        	for(int j=i+1; j<line.length; j++) {
                int[] xy = getIntersection(line[i], line[j]);
                if(xy!=null) {
                	arr.add(xy);
                }
        	}
        }
        
        min_y=arr.get(0)[0]; max_y=arr.get(0)[0];
        min_x=arr.get(0)[1]; max_x=arr.get(0)[1];
        		
        for(int i=1; i<arr.size(); i++) {
        	int y = arr.get(i)[0];
        	int x = arr.get(i)[1];
        	
        	if(y<=min_y) min_y=y;
        	else if(y>=max_y) max_y=y;
        	if(x<=min_x) min_x=x;
        	else if(x>=max_x) max_x=x;
        }
        
        int x_len = max_y-min_y+1, y_len = max_x-min_x+1;
        
        char[][] matrix = new char[y_len][x_len];
        answer = new String[y_len];
        
        for(int i=0; i<arr.size(); i++) {
        	matrix[Math.abs(arr.get(i)[1]-max_y)][arr.get(i)[0]+Math.abs(max_x)] = '*';
        }
        
        for(int i=0; i<matrix.length; i++) {
        	String s = "";
        	for(int j=0; j<matrix[i].length; j++) {
        		if(matrix[i][j]!='*') matrix[i][j] = '.';
        		s+=matrix[i][j];
        	}
        	answer[i] = s;
        }
        
        
        return answer;
    }
	private static int[] getIntersection(int[] line1, int[] line2) {
		double[] xy = new double[2];
		
		if(line1[0]*line2[1]==line1[1]*line2[0]) return null;
		
		xy[0] = (double)(line1[1]*line2[2]-line1[2]*line2[1])/(line1[0]*line2[1]-line1[1]*line2[0]);
		xy[1] = (double)(line1[2]*line2[0]-line1[0]*line2[2])/(line1[0]*line2[1]-line1[1]*line2[0]);

		if(xy[0]%1!=0||xy[1]%1!=0) return null;
		
		return new int[] {(int)xy[0],(int)xy[1]};
	}
	public static void main(String[] args) {
//		int[][] line = {{2,-1,4},{-2,-1,4},{0,-1,1},{5,-8,-12},{5,8,12}};
		int[][] line = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
//		int[][] line = {{1, -1, 0}, {2, -1, 0}};
//		int[][] line = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
		String[] s = solution(line);
		
		for(int i=0; i<s.length; i++)
			System.out.println(s[i]);
		
	}

}
