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
