package controller;

import java.util.*;
import model.*;

public class CheckLike {

    public String check(String input) {
        String str = "Server không hiểu bạn nói gì??";
        input = StringUtil.replaceAll(input);
        String[] arr = StringUtil.replaceAll(input).split(" ");
        List<String[]> list = new keyWord().getKeyWord();
        for (int i = 0; i < list.size(); i++) {
            String[] arS = StringUtil.replaceAll(list.get(i)[0]).split(" ");
            for (int j = 0; j < arS.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k].equals(arS[j])) {
                        str = list.get(i)[1];
                    }
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "Huong Tra Tan Huong Tra";
    }
}
