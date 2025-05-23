package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        // 리터럴도 타입이 있다.
        long var1 = 10;
        long var2 = 20;
        // long var3 = 1_000_000_000_000; 컴파일 에러
        long var4 = 1_000_000_000_000L;
        long var5 = 2_147_483_647;
        long var6 = 2_147_483_648L; // 인트의(?) 최대값 보다 더 큰 수를 쓸 때에는 끝에 L 을 붙여주자.
    }
}
