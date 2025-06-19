package ch08.sec11.exam02;

public interface MiniCar extends Car implements Vehicle {

    // stop 메소드는 Car로부터 구현부가 있는 메소드를 상속 받았기 때문에 implements 할 필요는 없다.
    // class > interface 이런 느낌

    @Override
    void run();

}
