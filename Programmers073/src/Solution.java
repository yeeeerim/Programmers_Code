// 직업군 추천하기

public class Solution {
    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        String[][] table_2d = new String[6][5];
		int sum = 0;
        
        for(int i=0; i<5; i++) {
    		table_2d[i] = table[i].split(" ");
        }
        
        for(int i=0; i<5; i++) {
    		int temp = 0;
        	for(int j=1; j<6; j++) {
        		for(int k=0; k<languages.length; k++) {
            		if(table_2d[i][j].equals(languages[k])) {
            			temp += (5-j+1) * preference[k];
            		}
        		}
        		
        	}
    		if(sum<temp) {
    			sum=temp;
        		answer = table_2d[i][0];
    		} else if(sum==temp) {
    			answer = answer.compareTo(table_2d[i][0])>0?table_2d[i][0]:answer;
    		}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7,5,5};
		System.out.println(solution(table, languages, preference));
		
		String[] table2 = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] languages2 = {"JAVA", "JAVASCRIPT"};
		int[] preference2 = {7,5};
		System.out.println(solution(table2, languages2, preference2));
	}

}
