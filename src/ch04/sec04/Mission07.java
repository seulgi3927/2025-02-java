package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = { 90, 88, 100, 70, 60 };

        // 어떤 학생이 받은 점수이다.
        // 평균점수를 구하라.

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;
        System.out.println("평균값: " + average);


    }


}

