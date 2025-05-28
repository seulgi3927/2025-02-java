package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        // for 문을 활용하여 위처럼 출력되게 해주세요

        int num=0;
        for (int i=1; i<=10; i++) {
            num = i;
            if (i == 10) {
                System.out.printf("%d", num);
            } else {
                System.out.printf("%d," , num);
            }
        }



    }
}

/*
다른 풀이방법

for(int i=; i<11; i++) {
if(i > 1) {
System.out.print(",";
}
System.out.print(i);
}
 */