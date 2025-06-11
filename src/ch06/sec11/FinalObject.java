package ch06.sec11;

public class FinalObject {
    // 상수는 멤버 필드는 반드시 초기화를 해야한다.
    private final  String name = "홍길동";
    // 멤버필드일땐 반드시 값을 넣어줘야된다. 지역변수일땐 상관없음

    // 그러나!! 생성자로 값을 넣는다는 내용이 있을 경우 선언만 가능하다.
    private  final int AGE;

    public FinalObject(int age) {
        this.AGE = age;
    }
    public void myAge() {
        System.out.println("age: " + this.AGE);
    }
}
