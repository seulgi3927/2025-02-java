package ch02.sec06;

public class StringMethodeExample {
    public static void main(String[] args) {

        String str1 = new String("안녕");
        String str2 = new String("안녕");
        printCompareString(str1, str2);
        // 두 문자열은 동일하다.
        // 두 문자열은 동등하다.
        // 두 문자열은 동등하지 않다.

    }
    public static void printCompareString(String str1, String str2) {
        if(str1 == str2) { // == 이 동등
            System.out.printf("두 문자열은 동일하다.");
        } else if (str1.equals(str1)) {
            System.out.printf("두 문자열은 동등하다.");
        } else {
            System.out.printf("두 문자열은 동등하지 않다.");
        }
        /* 혹은
        String result = "두 문자열은 동등하지 않다.";
        if(str1 == str2) {
           result = "두 문자열은 동일하다.";
        } else if (str1.equals(str1)) {
           result = "두 문자열은 동등하다.";
        }
         */

    }

}
