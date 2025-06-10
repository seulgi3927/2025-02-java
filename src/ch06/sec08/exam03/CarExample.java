package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setGas(10); // setter
        car1.setOil(20);


        int car1Cas = car1.getGas();
        System.out.println("car1Gas: " + car1Cas);
        System.out.println("car1Oil: " + car1.getOil());

        System.out.println("----------------------------------");
        Car car2 = new Car(130, 140); // gas=30, oil=40
        System.out.println("getGas: " + car2.getGas()); // 30
        System.out.println("getOil: " + car2.getOil()); // 40



    }







}
