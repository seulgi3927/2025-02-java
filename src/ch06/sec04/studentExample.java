package ch06.sec04;

public class studentExample {
    public static void main(String[] args) {
        Student s1 = new Student(); /* Student s1(변수)의 객체 주소값만 담을 수 있다?? 파라미터가 없으면 기본 생성자임 */
        Student s2 = new Student();

        s1.introduce();
        s2.introduce();

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce();
        s2.introduce();


    }
}
