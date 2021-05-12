package core.basis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: bamboo on 20/12/7
 * @description: _toArray到底是干嘛的
 */

public class ToArray {
    public static void main(String[] args) {

        find();
    }

    static void find() {
        List<String> list = new ArrayList<String>();
        list.add("have");
        list.add("no");
        list.add("problem");
        System.out.println(list);
//      toArray是将变量转换为了数组   <T> T[] toArray(T[] t)
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}


