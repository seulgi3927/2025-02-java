package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 12300;
        System.out.println("상품의 가격: " + value + "원");
        System.out.printf("상품의 가격: %d원\n", value);
        System.out.printf("상품의 가격: %, d원\n", value); // printf 는 콘솔에 찍는게 목적. 출력이 목적

        String result = String.format("상품의 가격: %,d원\n", value); // format 은 문자열 만드는게 목적, 2차,3차 가공이 가능
        System.out.println(result);

        System.out.printf("상품의 가격:%9d원\n", value);
        System.out.printf("상품의 가격:%-9d원\n", value);
        System.out.printf("상품의 가격:%011d원\n", value);


        int year = 2025;
        int mon = 10;
        int day = 14;
        // 2025-09-04
        // 2025-10-14
        // System.out.printf("%d-%02d-%02d", year , mon , day );
        System.out.printf("%d-%d-%d", year , mon , day );
        System.out.println();

        int radius = 10;
        double area = 3.14159 * radius * radius; // 반지름 10의 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이:%f입니다.\n" , radius, area); // 10자리수 나옴
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f입니다.\n" , radius, area); // 실수는 . 두자리까지만 표시
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f입니다.\n" , radius, area); // 총 합쳐서 10자리 차지할건데 부족한 곳은 0으로 채우겠다
        System.out.printf("반지름이 %d인 원의 넓이:%-10.2f입니다.\n" , radius, area); // 10칸에서 좌측정렬로 정렬하겠다

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s\n", 1, name, job);









    }
}
