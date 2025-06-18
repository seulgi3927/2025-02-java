package ch07.sec07.poly2;

    // Tv는 Product를 상속받는다.
    // Tv의 가격은 100만원입니다. (무조건)
    // Tv 객체의 주소값을 println에 찍으면 "Tv"가 출력되어야 한다. > toString 메소드 오버라이딩 (모든 객체는 object를 상속받는다)
    public class Tv extends Product { // 에러가 뜨는 이유는 tv가 객체화 되려면 product도 객체화가 되어야 한다는데
        // 부모가 기본 생성자가 없어서 빨간줄 에러가 떴었다.
        // 없애는 방법은 부모에 생성자를 넣거나 있는 생성자를 호출한다

        public Tv() {
            super(100);

    }

    @Override
        public String toString() {
            return "Tv";
    }




    }