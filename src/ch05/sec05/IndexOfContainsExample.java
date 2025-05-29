package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍 나이쓰 프로그래밍";
        int idx = subject.indexOf("프로그래밍");
        System.out.println("idx: " + idx);
        // 다음 단어가 시작된 위치한 index 값을 구하는 것
        // 중복이면 왼쪽에서부터 가장 빨리 찾는 값으로 나옴

        System.out.println(subject.indexOf("그"));
        System.out.println(subject.lastIndexOf("그"));

        // 해당 문자열에 내가 찾는 문자열이 있는가???
        boolean result = subject.contains("나이쓰"); // 문자열 말고도 다른데서도 사용가능한 이름이 contains
        System.out.println("result: " + result);

    }
}
