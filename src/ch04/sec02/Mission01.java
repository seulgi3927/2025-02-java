package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    /*
    (커맨드창으로 값을 입력받을것이다.)

    점수를 입력해주세요 > 60 (입력 후 엔터)

    (점수가 60점 이상이면) "합격입니다."
    (아니다) "불합격입니다."

    출력되면 된다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요> ");
        //int num = scanner.nextInt(); // string 으로 넣게 되면 Integer.parseInt(str); 해줘야함
        String str = scanner.next();

        try {
            int num = Integer.parseInt(str);
            if (num >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }
        } catch (Exception e) {
            System.out.println("숫자만 입력해주세요.");
        }

    }
}
