package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);
        System.out.println("--------------");


         y--;
         --y;
        System.out.println("y=" + y);
        System.out.println("------------");

        z = x++; // + 가 뒤에 있으면 읽기 먼저 하고 쓰기함 // x값을 읽어서 z에 주고 난 뒤에 ++ 처리함
        System.out.println("z=" + z); // 12. 왜죠?
        System.out.println("x=" + x); //13. 왜죠?
        System.out.println("--------------");

        z = ++x; // + 가 앞에 있어서 쓰고 나서 읽기 함
        System.out.println("2. z=" + z); // 14
        System.out.println("2. x=" + x); // 14
        System.out.println("--------------");

        // x = 14 y = 8
        z = ++x + y++;
        System.out.println("3. z=" + z); // 23 = 15(+이 앞에 있어서 먼저 처리) + 8 (+가 뒤에 있어서 나중에 되니까 8만 사용??)
        System.out.println("3. x=" + x); // 15
        System.out.println("3. y=" + y); // 9


    }
}
