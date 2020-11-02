package ABC085B;

import java.util.*;

/**
 * https://atcoder.jp/contests/abs/tasks/abc085_b
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> mochiList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mochiList.add(sc.nextInt());
        }

        Collections.sort(
                mochiList,
                // 降順ソート
                (o1, o2) -> Integer.valueOf(o2).compareTo(Integer.valueOf(o1))
        );

        int resultCount = 0;
        int previousNum = 101;
        for (int i = 0; i < n; i++) {
            if (mochiList.get(i) < previousNum) {
                resultCount++;
            }
            previousNum = mochiList.get(i);
        }

        System.out.println(resultCount);
    }

}
