package ch07.sec07.exm01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // 부모타입은 자식 객체 주소값 담을 수 있다. > 다형성 (상속관계에서만 일어남)

        A a2 = e; // 내 위에 있으면 부모 타입으로 a에 e 주소값 넣을 수 있다.

        E e2 = (E)a2; // 자동형변환은 안된다 (a2에 저장된 주소값을 알 수 없으므로)
        // D d2 = e; // 안 된다.
        // D d3 = (D)b; // 강제형변환해서 되는거처럼 보이지만 런타임때 에러 발생한다
                        // 자식 타입은 부모 객체 주소값을 담을 수 없다.

        // 다형성
        // 1. 부모는 자식의 주소값을 넣을 수 있다.
        // 2. 자식은 부모의 주소값을 넣을 수 없다.
        // 3. 부모는 다른 라인에 있는 자식의 주소값은 알 수 없다.(호출불가)
        //    즉, 타입을 알고 있는 메소드만 호출 할 수 있다

    }
}

class A { }
class B extends A { }
class C extends A { }

class D extends B { }
class E extends C { }
