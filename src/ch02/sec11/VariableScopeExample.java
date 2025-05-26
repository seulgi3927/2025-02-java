package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }
        // int v3 = v1 + v2 + 5; → v2가 중괄호{} 안에서 이미 끝나버려서 실행이 안됨
        

    }
}
