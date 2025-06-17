package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return this.arr.length;

    }

    public void add(String ga) {
        String[] temp = new String[arr.length + 1];
        // String[] temp = new String[ size() + 1 ]; 이렇게도 가능
        // temp[temp.length -1 ] = ga;
        temp[size()] = ga;
        // 기존값 복사
        for (int i = 0; i < size(); i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void add(int index, String item) {
        String[] temp = new String[size() + 1];
        temp[index] = item;
        for (int i = 0; i < size(); i++) {
//            if (i < index) {
//                temp[i] = arr[i];
//            } else {
//                temp[i + 1] = arr[i];
//            }
            temp[i < index ? i : i + 1] = arr[i];
        }
        this.arr = temp;

    }

    public String remove() {
        String[] temp = new String[size() - 1];
        String etc = this.arr[temp.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return etc;
    }

    public String remove(int ox){
        String[] temp = new String[size() - 1];
        String etc = arr[ox];
        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[ i < ox ? i : i + 1];
        }
        arr = temp;
        return etc;
    }


    // 점검용
    public void  checkValuses() {
        System.out.println(Arrays.toString((this.arr)));
    }

    public String get(int na) {
        return this.arr[na];
    }


}
