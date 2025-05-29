package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행"; // String 객체의 주소값이 hobby 변수에 대입
        hobby = null; // 여행문자열을 가지고 있는 String 객체는 낙동강 오리알 신세

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null; // kind1 에 있는 정보를 이미 kind2 에 복사를 했기에
        // kind1 에 null 을 줘도 자동차 라는 정보는 살아있다.



    }
}
