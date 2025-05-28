package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3; // 3 ~ 8 랜던값 생성
        System.out.println("star: " + star);

        for (int a=0; a<star; a++) {
            for (int i = 0; i < star; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

