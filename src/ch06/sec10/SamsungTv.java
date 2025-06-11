package ch06.sec10;

public class SamsungTv {
    public static String brand;
    public String model;
    public int inch;

    public void printValues() {
        System.out.printf("%s, %s, %d\n", brand, model, inch);
    }
    // 메소드와 클래스 앞에도 final을 붙일 수 있다. 효과에 대해서는 나중에.

    // static 붙어서 메모리에 올라가야하는데 model 이랑 inch는 호출 되지 않아 올라갈 수 없다.
    // (인스턴스 멤버필드는 static을 사용할 수 없다..??????)
    public /*static*/ void  staticMethod() {
        // 일단 static 을 쓰고 빨간줄 뜨면 static을 지워준다 ㅋㅋㅋ
        System.out.printf("%s, %s, %d\n", brand, model, inch);
                // 호출되지 model 이랑 inch 가 올라가려면 객체생성 해줘야한다.
    }
    // static 메소드는 static 멤버필드, 파라미터만 사용ㅎㅏ는 경우에만
    public static void staticMethod(int n1, int n2) {
        System.out.printf("%s, %s, %d\n", brand, n1, n2);
    }
    //


}
