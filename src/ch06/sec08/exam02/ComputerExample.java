package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer com = new Computer();
        int result1 = com.sum(1, 2, 3);
        System.out.println("result1: " + result1);
        int result2 = com.sum(1, 2, 3, 4);
        System.out.println("result2: " + result2);
        int result3 = com.sum(1, 2, 3, 4, 5);
        System.out.println("result3: " + result3);
    }
}
