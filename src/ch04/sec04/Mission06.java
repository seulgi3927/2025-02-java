package ch04.sec04;

public class Mission06 {
    public static void main(String[] args) {
        /*
        1부터 몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 무엇인지 알아내는 예제

        1 + 2 >> 3
        1 + 2 + >> 6

         */


        int b=0; // 계속 더할 곳

        for (int i=1; ; i++) { // 가운데 뭘 넣어야할지 모를땐 일단 ; 으로 구분해둔다
            b = i + b;
            if (b > 100) {
                System.out.print(i - 1);
                break;
            }
        }



    }
}

/*
또 다른 방법
int sum = 0;
int i = 0;
while ( true ) {
// sum += ++i

sum = sum +1 (++i)
if (sum > 100) {
i--;
break;
}
}
System.out.println("i: " +i);
 */