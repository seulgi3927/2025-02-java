package ch02.sec08;

public class Mission01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        double result = (double) num1/num2; // 더블로 들어갔으니 타입을 더블로 바꿔주면 결과도 더블로 나온다, 더블이 더 크니까
        System.out.println("result: " + result); // 3.33333어쩌고 나오게 처리 해주세요.
    }
}
