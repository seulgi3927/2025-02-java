package ch06.sec15;

public class Singleton {
    private String name;

    private Singleton() {}

    // 아래는 static 멤버필드
    // singleton 객체 주소값을 싱글톤에 저장
    private static Singleton singleton = null;
    public static Singleton getInstance() {
        if(singleton == null) {
           singleton = new Singleton();
        }
           return singleton;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void printMyName() {
        System.out.println("내 이름은 " + name + " 입니다!");

    }
}
