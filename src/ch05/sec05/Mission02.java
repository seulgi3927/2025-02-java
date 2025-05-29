package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "가나다라.haha.jpg";

        int idx = fileName.lastIndexOf(".") +1; // . 뒷 첫번째부터 끝까지 가지고 온다

        String ext = fileName.substring(idx); // 확장자 추출

        System.out.println("ext: " + ext);
    }
}
