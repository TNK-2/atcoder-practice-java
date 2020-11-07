package ABC049C;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/arc065_a
 */
public class Main {

    private String[] divide = new String[4];

    public Main() {
        divide[0] = new StringBuffer("dream").reverse().toString();
        divide[1] = new StringBuffer("dreamer").reverse().toString();
        divide[2] = new StringBuffer("erase").reverse().toString();
        divide[3] = new StringBuffer("eraser").reverse().toString();
    }

    public boolean isMatchable(String str) {
        String S = new StringBuffer(str).reverse().toString();
        for (int i = 0; i < S.length();) {
            boolean isDividable = false;
            for (int j = 0; j < 4; j++) {
                if (i + divide[j].length() > S.length()) {
                    continue;
                }
                String str2 = S.substring(i, i + divide[j].length());
                if (str2.equals(divide[j])) {
                    isDividable = true;
                    i += divide[j].length();
                }
            }
            if (!isDividable) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        if (main.isMatchable(sc.next())) {
            System.out.println(("YES"));
        } else {
            System.out.println(("NO"));
        }
    }
}
