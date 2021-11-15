// 배달

public class Solution {
	private static int graph[][];
	
	public static void input(int N, int[][] road) {
		graph = new int[N+1][N+1];
		for(int i=0; i<N; i++) {
			if(graph[road[i][0]][road[i][1]] > road[i][2] || graph[road[i][0]][road[i][1]]==0) {
				graph[road[i][0]][road[i][1]] = road[i][2];
				graph[road[i][1]][road[i][0]] = road[i][2];
			}
		}
	}
	
    public static int solution(int N, int[][] road, int K) {
    	int MAX = 2001;
        int answer = 0;
        int distance[] = new int[N+1];
        boolean[] check = new boolean[N+1];
        
        // 초기화
        distance[1] = 0;
        check[1] = true;
        
        for(int i=2; i<=N; i++) {
        	distance[i] = MAX;
        }
        
        input(N, road);
        
        // 노드1과 바로 연결되는 노드들의 거리를 distance 배열에 갱신
        for(int i=1; i<=N; i++) {
        	if(!check[i] && graph[1][i]!=0) {
        		distance[i] = graph[1][i];
        	}
        }
        
        // 나머지 노드들 distance 배열 갱신
        for(int i=0; i<N-1; i++) {
        	int min_index = -1;
        	int min_value = MAX;
        	
        	for(int j=0; j<=N; j++) {
        		if(!check[j] && distance[j]!=MAX) {
        			if(distance[j] < min_value) {
        				min_value = distance[j];
        				min_index = j;
        			}
        		}
        	}
        	check[min_index] = true;
        	
        	for(int j=1; j<=N; j++) {
        		if(!check[j] && graph[min_index][j]!=0) {
        			if(distance[j] > distance[min_index]+graph[min_index][j]) {
        				distance[j] = distance[min_index]+graph[min_index][j];
        			}
        		}
        	}
        }
        
        for(int i=1; i<=N; i++) {
        	if(distance[i]<=K) {
        		answer++;
        	}
        }
       

        return answer;
    }
	public static void main(String[] args) {
		int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
		System.out.println(solution(5, road, 3));
	}

}
