package ch07.sec07.poly;

public abstract class Animal2 {

    private int age;

    // 추상 메소드
    // 추상 메소드를 단 하나라도 가지고 왔다면 그 클래스는
    // 추상 클래스가 되어야 한다.
    // 내 밑에 추상클래스가 없어도 추상클래스가 될 수 있다
    public abstract void crying();
    // abstract 는 내용이 없고 static 는 내용이 있다.
    // 추상클래스는 객체화가 안된다. 내용이 없어도 abstract 가 붙으면 객체화가 안된다

}
