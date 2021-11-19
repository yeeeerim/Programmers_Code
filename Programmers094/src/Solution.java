
public class Solution{
	static int max = 0;
	static int init = 0;
	
	static class Dungeon {
		int min;
		int consume;
		
		public Dungeon(int min, int consume) {
			this.min = min;
			this.consume = consume;
		}
	}
	
    public static int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        Dungeon[] arr = new Dungeon[len];
        init = k;
        
        for(int i=0; i<len; i++) {
        	arr[i] = new Dungeon(dungeons[i][0], dungeons[i][1]);
        }
        
        permutation(arr,0,len,len);
        
        return max;
    }



	static void permutation(Dungeon[] arr, int depth, int n, int r) {
		
	    if (depth == r) {
			int cnt = 0;
			int k = init;
			
	    	for(int i=0; i<n; i++) {
	    		if(k>=arr[i].min) {
	    			k-=arr[i].consume;
	    			cnt++;
	    		}
	    	}
	    	
	    	if(max<cnt) max=cnt;
	    	
	        return;
	    }
	 
	    for (int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r);
	        swap(arr, depth, i);
	    }
	}
	 
	static void swap(Dungeon[] arr, int depth, int i) {
	    Dungeon temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}
	
	
	public static void main(String[] args) {
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.println(solution(80,dungeons));
	}

}
