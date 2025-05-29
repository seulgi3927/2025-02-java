package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-4230123";
        char gender = ssn.charAt(7);
        System.out.println("gender: " + gender);



        switch ( gender ) {
            case '1', '3':
                System.out.println("남자입니다.");
                break;
            case '2', '4':
                System.out.println("여자입니다.");

        }
        int intGendef = Character.getNumericValue(gender);
        System.out.println("--끝--");

        /*
        또 다른 방법
        switch(gender) {
        case '1', '3' -> System.out.println("남자");
        case '2', '4' -> System.out.println("여자");

         */





    }

    public static class EmptyStringExample {
        public static void main(String[] args) {
            String hobby = "";
            if(hobby.equals("")) { // ("".equals(hobby)) 이렇게 사용하는게 에러날 확률이 없다.
                System.out.println("hobby변수는 빈 문자열 객체를 참조");



            }
        }
    }
}
