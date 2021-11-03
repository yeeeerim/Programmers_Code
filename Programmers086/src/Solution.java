import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
	static class Node {
		int x;
		int y;
		
		Node(int x, int y) {
			this.x=x; this.y=y;
		}
	}
	
	static class Edge {
		int x;
		int y;
		
		Edge(int x, int y) {
			this.x=x; this.y=y;
		}
	}
	
	 // 노드 n을 엣지 e 방향으로 이동하는 함수
	static Node move(Node n, Edge e) {
		int x = n.x, y = n.y;
		Node new_n = new Node(0,0);
		
		new_n.x = n.x+e.x;
		new_n.y = n.y+e.y;
		
		return new_n;
	}

	
    public static int[] solution(String[] grid) {
//    	변수 선언
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        char[][] in = new char[grid.length][grid[0].length()];
        Node n;
        Edge e;
        int w = grid[0].length();
        int h = grid.length;
        boolean[] cycle_check = new boolean[4];
        
        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(-1,0));
        edges.add(new Edge(0,1));
        edges.add(new Edge(1,0));
        edges.add(new Edge(0,-1));
        
        for(int i=0; i<h; i++) {
        	for(int j=0; j<w; j++) {
        		in[i][j] = grid[i].charAt(j);
        	}
        }
        
        
//      알고리즘
        
        for(int i=0; i<4; i++) {
            int cnt = 0;
        	n = new Node(0,0);
        	e = edges.get(i);
        	if(cycle_check[i]==true) continue;
            do {
            	
            	if(n.x==0&&n.y==0) {
            		for(int j=0; j<4; j++) {
            			if(edges.get(j).x==e.x&&edges.get(j).y==e.y) {
            				cycle_check[j]=true;
            			}
            		}
            	}
            	
            	// 1. edge 방향으로 node 이동
//            	System.out.println(n.x+","+n.y);
            	cnt ++;
            	n = move(n,e);
            	
            	// 2. 벽 처리
            	if(n.x<0) {
            		n.x = w-1;
            	} else if(n.y<0) {
            		n.y = h-1;
            	} else if(n.x>=w) {
            		n.x=0;
            	} else if(n.y>=h) {
            		n.y=0;
            	}

            	
            	// 3. edge 방향 전환
            	switch(in[n.y][n.x]) {
    	        	case 'S' : // 직진
    	        		break;
    	        	case 'L' : // 좌회전
    	        		e = rotate(e,0);
    	        		break;
    	        	case 'R' : // 우회전
    	        		e = rotate(e,1);
    	        		break;
            	}
            	
            } while((n.x!=0||n.y!=0)||(e.x!=edges.get(i).x||e.y!=edges.get(i).y));
            arr.add(cnt);
//            System.out.println("----------------------");
        }

        
//      결과
        Collections.sort(arr);
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }

	private static Edge rotate(Edge e, int i) {
		Edge new_e = new Edge(0,0);
		
		if(i==0) { // 좌회전
			if(e.x==-1) {
				new_e.x=0; new_e.y=1;
			} else if(e.x==1) {
				new_e.x=0; new_e.y=-1;
			} else if(e.y==1) {
				new_e.x=1; new_e.y=0;
			} else {
				new_e.x=-1; new_e.y=0;
			}
		} else { //우회전
			if(e.x==-1) {
				new_e.x=0; new_e.y=-1;
			} else if(e.x==1) {
				new_e.x=0; new_e.y=1;
			} else if(e.y==1) {
				new_e.x=-1; new_e.y=0;
			} else {
				new_e.x=1; new_e.y=0;
			}
		}
		
		return new_e;
	}


	public static void main(String[] args) {
		String[] grid = {"SL","LR"};
		String[] grid2 = {"S"};
		String[] grid3 = {"R", "R"};
		int[] answer = solution(grid);
		for(int i=0; i<answer.length; i++)
			System.out.print(answer[i]+" ");

	}

}
