package ch07.sec02;

public class SmartPhone extends Phone {
    private boolean wifi;
    // 멤버필드에 파이널이 붙지 않았으면 무조건 private 달아주자?

    public SmartPhone(String model, String color) {
        // super(); → 부모생성자 호출인데 자동으로 생략됨.
        // 기본 생성자가 없으면 기본생성자가 자동으로 들어가는데..

        super(model, color);
        // 무조건 부모생성자 호출코드가 최상위에 있어야 한다.
        System.out.println("SmartPhone 생성자 호출!!");

    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }

    public void bell() {
        System.out.println("스마트폰이 울린다!!");
    }





}
