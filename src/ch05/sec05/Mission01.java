package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    /*
    주민번호를 입력하시오. (xxxxxx-xxxxxxx)>

    (만약)주민등록번호길이가 다르면 "잘못 입력하셨습니다."
    (길이가 맞다면) 8번째 자리의 값으로 "여성", "남성" 출력해주세요.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("주민번호를 입력하시오 > ");


        String str = scanner.nextLine();

        if(str.length() == 14) {
            char str1 = str.charAt(7);
            switch ( str1 ) {
                case '1', '3':
                    System.out.println("남자입니다.");
                    break;
                case '2', '4':
                    System.out.println("여자입니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        } else{
                System.out.println("잘못 입력하셨습니다.");
            }


    }
}
