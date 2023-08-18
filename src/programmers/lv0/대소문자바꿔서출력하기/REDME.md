# 대소문자 바꿔서 출력하기


## 문제 설명

영어 알파벳으로 이루어진 문자열 `str`이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.



## 제한사항
- 1 ≤ str의 길이 ≤ 20
	- str은 알파벳으로 이루어진 문자열입니다.


## 입출력 예
### 입력 예 #1
```java
aBcDeFg
```


### 출력 예 #1
```java
AbCdEfG
```


### 풀이 

- 문자열을 받아 char 배열로 변경 : `char[] chList =  str.toCharArray();`
- `for`문 으로 배열을 확인
- 내부에서 `if`문으로 `Character.isUpperCase()` 메서드로 각 문자가 대문자인지 비교 
- 대문자가 맞다면 `Character.toLowerCase()`를 사용하여 소문자로 변경
- 대문자가 아니라면 (소문자) `Character.toUpperCase()`를 사용하여 대문자로 변경

