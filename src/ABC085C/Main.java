package ABC085C;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc085_c
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // お札の枚数
        int Y = sc.nextInt(); // 合計金額

        int x = Y / 10000; // 10000円札の枚数
        int y = 0; // 5000円札の枚数
        int z = 0; // 1000円札の枚数

        for (; x >= 0; x--) {

            y = (Y - 10000 * x) / 5000;
            for (; y >= 0; y--) {

                z = (Y - (10000 * x) - (5000 * y)) / 1000;
                for (; z >= 0; z--) {
                    if ((n != x + y + z)) {
                        break;
                    }
                    if ((10000 * x + 5000 * y + 1000 * z == Y) && (n == x + y + z)) {
                        System.out.println(x + " " + y + " " + z);
                        return;
                    }
                }
            }
        }

        System.out.println(-1 + " " + -1 + " " + -1);
    }
}
