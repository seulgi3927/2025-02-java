package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        System.out.println("x: " +  x);
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b; // byte 를 작성할 수 없다. 쓰면 int 로 변화됨
        System.out.println("y: " + y);




    }
}
