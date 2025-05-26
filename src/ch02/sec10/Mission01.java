package ch02.sec10;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력해 주세요> ");
        String strNum = scanner.next(); // 입력받은 문자열을 정수로 파싱하여 x2한 값을 출력

        int a = Integer.parseInt(strNum) * 2; // strNum←문자이기 때문에  strNum + () ← 이자리에 무엇이 와도 문자로 붙는다
        System.out.println("a: " + a);

        /* 또 다른 방법은
        int a = Integer.parseInt(strNum);
        System.out.println(num * 2);
        */






    }
}
