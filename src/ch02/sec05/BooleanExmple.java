package ch02.sec05;

public class BooleanExmple {
    public static void main(String[] args) {
        boolean stop = false;
        if(stop) {
            System.out.println("중지");
        } else {
            System.out.println("시작");
        }

        int x = 10;
        boolean resultl1 = x == 20;
        boolean result2 = x != 20;
        System.out.println("result1: " + !result2);
        System.out.println("result2: " + !result2);
        System.out.println("!result2: " + !result2);
       // System.out.println("!result20: " + !(x !=r));

    }
}
