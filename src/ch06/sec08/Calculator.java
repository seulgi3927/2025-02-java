package ch06.sec08;

public class Calculator {
    // void 메소드 , void는 값을 주지 않는다.
    public void powerON() {
        System.out.println("전원을 켭니다.");
    }
    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 리턴 메소드
    public int plus(int n1, int n2) {
        int result = n1 + n2;
        return result; // 값을 하나 데리고 호출한 곳으로 돌아간다. 어떠한 타입을 데리고 돌아간다(호출한 타입, 타입이 다르면 안됨)


    }
}
