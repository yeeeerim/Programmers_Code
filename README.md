# Programmers_Code

[프로그래머스](https://programmers.co.kr/learn/challenges)에서 작성한 소스코드 관리 

<br>

## 🌳 알고리즘 정리
- [유클리드 알고리즘](https://blockdmask.tistory.com/53) : 주어진 두 수 사이에 존재하는 최대공약수(GCD)를 구하는 알고리즘
```
int gcd(int a, int b){
    if(b == 0){
        return a;
    }else{
        return gcd(b, a%b);
    }
}
```

- [Class Stack\<E>](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html) : java.util.Stack 에 존재하는 Stack 클래스
```
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.pop();
```

- [Comparator\<T>/Comparable\<T>](https://ifuwanna.tistory.com/232) : Arrays.sort의 compare 혹은 compareTo 메소드를 override하기 위한 인터페이스 `Programmers 58`
```
Class Sorting implements Comparator<String> {
    public String[] sorting() {
        String[] s = {"6", "10", "2"};
        Arrays.sort(s, new Sorting());
        return s;
    }
    
    @override
	public int compare(String s1, String s2) {
		String temp1 = s1+s2, temp2 = s2+s1;
		
		return temp2.compareTo(temp1);
	}
}
```

- [Collections.reverseOrder()](https://coding-factory.tistory.com/549) : Arrays.sort의 내림차순 정렬
```
Arrays.sort(arr, Collections.reverseOrder());
```

- [StringBuilder](https://hardlearner.tistory.com/288) : 문자열 연산에 대한 부하를 줄이기 위한 클래스
```
Stringbuilder sb = new Stringbuilder();
sb.append("a");
sb.append("b");
System.out.println(sb.toString());
```
```
