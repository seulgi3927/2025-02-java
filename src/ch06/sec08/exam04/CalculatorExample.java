package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        // 한 변의 길이가 40인 정사각형의 넓이를 구하고 싶소.

        Calculator cal = new Calculator();
        double result = cal.areaRectangle(40);
        System.out.println("정사각형 넓이: " + result);




    double result2 =  cal.areaRectangle(40, 50);
        System.out.println("직사각형 넓이: " + result2);

    }

}
