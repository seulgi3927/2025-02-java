package ch04.sec04;

public class Mission04 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; // 2~12 랜덤값

        for (int i = 1; i<= 9; i++) { // i<=9 이 자리에 i<10 넣어도 됨
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }

    }
}
