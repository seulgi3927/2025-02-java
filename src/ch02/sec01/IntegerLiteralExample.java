package ch02.sec01;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수 0b
        int var2 = 0206; // 8진수 0
        int var3 = 365; // 10진수 숫자
        int var4 = 0xB3; // 16진수 0x숫자 (0~9, A, B, C, D, E, F)

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

        System.out.println("var3 - 2진수: " + Integer.toBinaryString(var3));
        System.out.println("var3 - 8진수: " + Integer.toOctalString(var3));
        System.out.println("var3 - 16진수: " + Integer.toHexString(var3));

        // FFFFFF
        //       (15*16*16) + (15*16) + 15

    }
}
