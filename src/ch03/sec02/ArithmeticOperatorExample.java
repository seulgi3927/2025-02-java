package ch03.sec02;

public class ArithmeticOperatorExample {
    // 산술연산자
    public static void main(String[] args) {
        int v1 = 10, v2 = 4, v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1); // result1: 14
        System.out.println("result2: " + ( v1 + v2 - v4)); // result2: 4 // 10+4-10

        System.out.println("result3: " + ((float) v1 / v2) );

        int result4 = v1 % v2; // % 노드 라고 한다, 나머지값 구하는 거, / 나누기는 몫을 구하는것
        System.out.println("result4: " + result4); // result4: ??





    }
}
