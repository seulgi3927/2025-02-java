package ch04.sec04.method;

import ch02.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7);
        System.out.println("star: " + star);

        // 콘솔에 출력
        // 5 였다면 ***** (개행)
        // 3 였다면 *** (개행)

        printSingleLine(star);
        printSingleLine(10);
        printSingleLine(20);
        System.out.println("===================");
       // printMultiLine(4);
        // ****
        // ****
        // ****
        // ****

        printMultiLine(star);
        // ******
        // ******
        // ******
        // ******
        // ******
        // ******
        System.out.println("===================");
        printTriangleLine(4);
        // *
        // **
        // ***
        // ****


    }
    public static void printSingleLine(int star) {
        for (int i=0; i<star; i++)  {
            System.out.printf("*");
        }
        System.out.println();
    }
    public static void printMultiLine(int num) {
        for(int i=0; i<num; i++) {
            printSingleLine(num);
        }
        System.out.println();
    }
    public static void printTriangleLine(int tr) {
        for(int i=0; i<=tr; i++) {
            printSingleLine(i);

        }
    }
}
