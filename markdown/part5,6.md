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



### 생성자

```java
public Car(String n) {
    blabla
}

public Car() {
    this(n);
}
```



### 오버로딩

```java
public int plus(int x, int y) {
		return x + y;
	}

public int plus(int x, int y, int z) {
    return x + y + z;
}

public String plus(String x, String y) {
    return x + y;
}
```



### 상속

> `extends blabla`



### 접근 제한자

- `private` : 자신만
- `protected` : 같은 패키지 or 상속 받았을 때만 사용 가능
- `public > protected > default > private`





### 추상 클래스

> 구체적이지 않은 클래스
>
> 인스턴스 생성 불가능
>
> 추상 메서드 오버로딩을 위해 사용한다



### Super

> 부모를 가리키는 키워드 `super`



### 오버라이딩

> 부모 클래스의 메서드를 자식클래스에서 재정의



### 내부 클래스

```java
package study;

public class InnerExam1 {
    class Cal {
        int value = 0;

        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();

        cal.plus();
        System.out.println(cal.value);
    }
}
------------------------------------------------
package study;

public class InnerExam2 {
    static class Cal{
        int value = 0;
        public void plus() {
            value++;
        }
    }
    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
---------------------------------------------------
package study;

public class InnerExam3 {
    public void exec() {
        class Cal{
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal() ;
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
```





### 익명 클래스

```java
package study;

public class ActionExam {
    public static void main(String[] args) {
//        Action action = new MyAction();
//        action.exec();
        Action action = new Action() {

            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
```

