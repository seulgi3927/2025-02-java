package ch06.sec08;
// p.232~
public class CalculatorExample {
    // 여기(클래스 직속) 변수 선언된거면 그게 멤버필드(전역변수)임

    public static void main(String[] args) { // static 이 붙으면 객체화가 필요없다.
        Calculator cal = new Calculator(); // new 다음엔 무조건 생성자 호출
                                           // new Calculator() < 기본 생성자
                                           // 생성자를 하나도 안 적었을땐 컴파일러가 자동으로 생성자를 넣어준다.?
                                           // = 오른쪽에 있는 것을 왼쪽으로 주소복사 ㅋ
        int result = cal.plus(1, 2); // 변수는 나를 감싸고 있는 스코프 안에서만 살아있음 그래서 변수 선언을 다시 해줘야함
        System.out.println("result: "+ result);
        System.out.println("result1: "+ cal.plus(10, 20));
        System.out.println("result: "+ 30);

        cal.powerON();
        cal.powerOff();


        System.out.println("끝");


    }

}
