package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + value1);
        // 문자열로 바뀌었는지 아닌지 확인하려면  value1 + 1 로 확인해보면 된다. 101 이 되면 변환 안된거 11 이면 된거

        double value2 = Double.parseDouble("3.14"); // Wrapper Type Class
        // double valeu2_1 = (double)"3.14"; → 이렇게는 타입변환이 안된다.
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("ture");
        System.out.println(value3);

        long value4 = Long.parseLong("100000");
        System.out.println(value4);


        int intvalue = 10;
        // String str1 = intvalue + "";
        String str1 = String.valueOf(10); // () 안에 무얼 넣든 문자로 변환시켜줌??
        System.out.println(str1);

        String str2 = String.valueOf(value2);
        System.out.println(str2);












    }
}
