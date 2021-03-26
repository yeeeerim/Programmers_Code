public class Solution {
	static boolean solution(String s) {
        int pNum=0, yNum=0;
        
        for(int i=0; i<s.length(); i++) {
        	if((s.charAt(i)+"").toLowerCase().equals("p")) {
        		pNum++;
        	}else if((s.charAt(i)+"").toLowerCase().equals("y")) {
        		yNum++;
        	}
        }
        
        if(pNum==yNum) return true;
        else return false;
    }
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
	}

}
