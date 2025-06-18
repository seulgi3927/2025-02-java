package ch07.sec07.poly;

public class AnimalExample2 {
    public static void main(String[] args) {
        // 주소값 instanceof(인스탄스오브) 타입 (주소값이 타입으로 형변환이 되는가?)
        // 타입이 주소값을 저장할 수 있나? 를 물어봄
        // 저장할 수 있으면 true, 없으면 false 결과가 된다.

        Tiger tiger = new Tiger();

        System.out.println(tiger instanceof Cat); // true

        Cat cat = tiger;

        System.out.println(cat instanceof Tiger); // true
        // 이미 cat 에 tiger 주소값이 담겨 있기 때문에 true 가 된다

        Tiger tiger2 =  (Tiger) cat; // 자동형변환 안됨, 왜냐 cat 주소값이 담겨 있을지도 모르니까
        // 형변환 해서 문제가 없을때만 true가 된다??

        System.out.println(tiger2 instanceof Animal); // true




    }
}
