/**
 * Created by wangmian on 16/12/28.
 */

public class Solution {
    public static String convert(String s, int numRows){
        if (numRows == 1) return s;
        int step = numRows * 2 - 2, len = s.length();
        String ret = "";
        // first row
        for (int i = 0; i < len; i += step)
            ret += s.charAt(i);
        for (int i = 1; i < numRows - 1; i++) {
            for (int j = i; j < len; j += step) {
                ret += s.charAt(j);
                if (j + (step - i * 2) < len)
                    ret += s.charAt(j + (step - i * 2));
            }
        }
        // last row
        for (int i = numRows - 1; i < len; i += step)
            ret += s.charAt(i);
        return ret;
    }



    public static void main(String[] args) {
        String test = "wonmian";
        String haha = convert(test,3);
        System.out.println(haha);


    }
}
