package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int val = getCharToInt('c');


    }
    public static int getCharToInt(char ch) {
        return ch; // return 메소드는 return 이라는  키워드를 생략할 수 없다.
    }

        // return 메소드, void 메소드
        // 리턴타입, 메소드명, 파라미터, 구현부

    public static void printCharToInt(char ch) { // void 메소드, 주어진 값이 없다.
        System.out.printf("%c: %d\n", ch, (int)ch);
        // return; → void 메소드에서는 생략가능하다. (자동으로 들어감)




    }
}


