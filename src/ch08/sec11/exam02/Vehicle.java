package ch08.sec11.exam02;

/*
    인트페이스는 인스턴스 멤버필드를 가질 수 없다.
    static final 멤버필드는 가질 수 있다.

    무조건 추상 메소드만 가질 수 있다.
    public abstract 생략 가능, 생략하면 자동으로 붙은다.

    상속은 extends가 아닌  implements 를 사용한다.
    인터페이스가 인터페이스를 상속할땐 extends 를 사용한다.
    다중상속도 가능하다.

 */


// 운송수단 (탈것)
public interface Vehicle {

    void run();
    void stop();


}
