# 객체 지향 프로그래밍

> 프로그램을 구성하는 요소를 객체로 만들어 상호작용



## 자바의 변수 타입

### 기본형

- 논리형, 문자형, 정수형, 실수형

### 참조형

- 그 외의 모든 변수

```java
String str = new String("Hello");
```



## String class

- new를 사용하지 않아도 생성 가능
- 한번 생성한 인스턴스를 바꿀 수 없음



### Method

- `substring(index)`
- `equal` : 값을 비교
- `length`
- `concar`: string 더하기



## Class

### Field

```java
public class car {
    String name;
    int number;
}
```



### Method

> Parameter : 변수
>
> Argument : 전달 된 값

```java
public class car {
	public int myMethod(int x) {
        return 3;
    }	
}
```



### Scope & static

> static을 쓰면 인스턴스화 하지 않아도 사용할 수 있다.

```java
public class VariableScopeExam {

	int globalScope = 10;
	static int staticVal = 7;
	public void scopeTest(int value) {
		int localScope = 20;

		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2 (int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
	}
}
```



### enum

> 특정값만 변수가 가지게 하고 싶을 때

```java
enum Gender {
	MALE, FEMALE;
}
```

