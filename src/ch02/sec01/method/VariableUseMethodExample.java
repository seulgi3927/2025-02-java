package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10, 20); // 10:20
        printTime(2, 9); // 02:09

        printTime(2, 9, 2); // 02:09:02
        printTime(12, 9, 22); // 12:09:22

    }

    public static void printTime (int hour, int min, int sec){
       // System.out.printf("%02d:%02d\n", hour, min);

        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
       /* String strMin = min < 10 ? "0" + min : String.valueOf(min);
        String strSec = sec < 10 ? "0" + sec : String.valueOf(sec);

        System.out.print(strHour + ":" + strMin + ":" + strSec + "\n"); */
        System.out.print(strHour + ":");
        printTime(min,sec);

    }

    public static void printTime(int hour, int min) {
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        String strMin = min < 10 ? "0" + min : String.valueOf(min);
        System.out.print(strHour + ":" + strMin + "\n");



    }
}
