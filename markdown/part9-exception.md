# Exception

> `try / catch / finally`



### `throws` / `throw`

> throws : 호출 하는 쪽에서 오류를 처리하게 함

```java
public static int divide(int i, int j) throws IllegalArgumentException {
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌수 없습니다");
        }
        int k = i / j;
        return k;
    }
```



### 사용자 정의 Exception

```java
public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}

```

