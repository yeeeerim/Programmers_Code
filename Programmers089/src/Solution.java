import java.util.*;

public class Solution {
    static ArrayList<Node> queue = new ArrayList<>();
    static int front = 0;
    
	static class Node {
		int x;
		int y;
		int len;
		
		Node(int y, int x) {this.x=x; this.y=y; len=0;}
	}
	
	static Node pop() {
		return queue.remove(0);
	}
	
	static void push(Node n) {
		queue.add(n);
		front++;
	}
	
    public static int solution(int[][] maps) {
        int w = maps[0].length;
        int h = maps.length;
        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        boolean[][] visited = new boolean[h][w];
        
        Node now = new Node(0,0);
        push(now);
		visited[now.y][now.x] = true; 
        
//        bfs
        while(true) {
        	now = pop();
        	
        	if(now.x==w-1&&now.y==h-1) break;
        	
        	for(int i=0; i<4; i++) {
        		int dir_x = now.x+dir[i][1], dir_y = now.y+dir[i][0];
        		if(dir_x<0||dir_x>=w||dir_y<0||dir_y>=h) continue; //벽
        		Node p = new Node(dir_y, dir_x);
        		if(visited[p.y][p.x]==false&&maps[p.y][p.x]==1) {
        			p.len = now.len+1;
        			push(p);
        			visited[p.y][p.x] = true;
        		}
        	}
        	
        	if(queue.size()==0) return -1;
        }
        
        return now.len+1;
    }
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		System.out.println(solution(maps));
	}

}
