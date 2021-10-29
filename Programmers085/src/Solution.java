import java.util.ArrayList;

// 카카오 프렌즈 컬러링북

public class Solution {
	
	static Point move(Point p, int dir) {
		int x = p.x;
		int y = p.y;
		Point temp;
		
		switch(dir) {
		case 0: // North
			x--; break; 
		case 1: // East
			y++; break;
		case 2: // South
			x++; break;
		case 3: // West
			y--; break;
		}
		
		temp = new Point(x,y,0);
		
		return temp;
	}
	
	static class Point {
		int x;
		int y;
		int color;
		
		public Point(int x, int y, int color) {
			this.x = x;
			this.y = y;
			this.color = color;
		}
	}
	
    public static int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        ArrayList<Point> arr;
        
        
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
//        		System.out.println("i,j = "+i+","+j);
        		if(picture[i][j]!=0) {
            		arr = new ArrayList<>(); // 현재 영역
        			Point p = new Point(i, j, picture[i][j]);
//					System.out.println(p.x+","+p.y);
        			picture[i][j]=0; // 방문한 곳 0으로 표시
        			arr.add(p); // 현재 영역에 추가
        			int size = 1;
        			
        			while(arr.size()!=0) {
        				
        				for(int k=0; k<4; k++) {
//        					System.out.println("k: "+k);
            				Point next = move(p,k);
            				if(next.x>-1&&next.x<m&&next.y>-1&&next.y<n) { // 벽이 아니고
                				next.color = picture[next.x][next.y];
            					if(next.color==p.color) { // 색상이 같으면
            						arr.add(next); // 현재 영역에 추가
            						size++;
//            						System.out.println(next.x+","+next.y);
            						p = next;
            						picture[next.x][next.y]=0;
            						k=-1;
            						continue;
            					}
//            					else {System.out.println("다른색");}
            				}
//            				else {System.out.println("벽="+k);}
            				if(k==3&&arr.size()!=0) { 
//            					System.out.println("pull : "+arr.get(arr.size()-1).x+","+arr.get(arr.size()-1).y);
            					p = arr.remove(arr.size()-1);
            					k=-1;
            				}
            			}
        				
        			}
        			
        			numberOfArea++;
        			if(maxSizeOfOneArea<size) {
        				maxSizeOfOneArea = size;
        			}
        			
        		} 
        	}
        }
        

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
   
	public static void main(String[] args) {
//		int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
//		int[] answer = solution(6,4,picture);
//		int[][] picture = {{1,1,1,0},{1,1,1,0},{0,0,0,1},{0,0,0,1},{0,0,0,1},{0,0,0,1}};
//		int[] answer = solution(6,4,picture);
		int[][] picture = {{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0},
				{0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0},
				{0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}};
		int[] answer = solution(13,16,picture);
		System.out.println(answer[0]+", "+answer[1]);
	}

}
