package ch03;

public class Confirmation04 {
    public static void main(String[] args) {
        int value = 456;

        // 1. 3.56
        // 2. 3.56 > 3
        // 3. 3 * 100
        System.out.println((int)(value * 0.01) *100 );

        // 1. 3 (나누기)
        // 2. 3 *100
        System.out.println(value / 100 * 100);

        // 1. 56 구한다
        // 2. 356 -56 뺀다
        System.out.println(value - value % 100); // 300


        int x = 10;
        int y = 5;
        System.out.println((x>7) && (y<=5));
        System.out.println((x % 3 == 2) || (y % 2 != 1));


        double x1 = 5.0;
        double y1 = 0.0;
        double z1 = 5 % y1;

        if (Double.isNaN(z1)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z1 + 10;
            System.out.println("결과: " + result);
        }
    }
}
