package Assignment1;

import java.util.*;
public class Unique {

    static final int NO_OF_CHARS = 256;

    static void findUnique(String str) {

        int[] count = new int[NO_OF_CHARS];
        int i;
        int n = str.length();
        int flag = 0;

        for (i = 0; i < n; i++) {

            if (Character.isAlphabetic(str.charAt(i)) || Character.isWhitespace(str.charAt(i)))
                continue;
            else {
                System.out.println("Invalid Sentence");
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            for (i = 0; i < n; i++)
                if (str.charAt(i) != ' ')
                    count[(int) str.charAt(i)]++;
            String s = "";
            for (i = 0; i < n; i++)
                if (count[(int) str.charAt(i)] == 1)
                    s = s + str.charAt(i);

            if (s.length() == 0)
                System.out.println("No unique characters");
            else {
                System.out.println("Unique characters:");
                for (i = 0; i < s.length(); i++)
                    System.out.println(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "maam";
        findUnique(str);
    }
}
