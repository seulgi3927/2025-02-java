package ch06.sec09;

public class StaticCarExample {
    public static void main(String[] args) {
        StaticCar.model = "benz";
        StaticCar.setSpeed(200);
        StaticCar.run();

        Math.random();

        StaticCar car1 = new StaticCar("BMW");
        car1.setSpeed(100);
        car1.run();

        StaticCar.run();
    }
}
