package ch15;

public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        int length = list.size();
        list.checkValuses();
        System.out.println("length: " + length);
        list.add("가");
        list.checkValuses();
        list.add("나");
        list.checkValuses();

        String str = list.get(0);
        System.out.println("str: " + str);
        System.out.println("list.get(1): " + list.get(1));
        list.add("다");
        list.add("라");

//       String str1 = list.get(2);
//       String str2 = list.get(3);
        list.checkValuses();

        list.add(1, "크");
        list.checkValuses();

        String str2 = list.remove();
        System.out.println("str2: " + str2); // 라
        list.checkValuses(); // [가, 크, 나, 다]

        String str3 = list.remove(1); // 크
        System.out.println("str3: " + str3); // [가, 나, 다]
        list.checkValuses();


    }

}
