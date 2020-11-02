package ABC088B;

import java.util.*;

/**
 * https://atcoder.jp/contests/abs/tasks/abc083_b
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextInt());
        }

        Collections.sort(
                cards,
                (Comparator<Integer>) (o1, o2) -> Integer.valueOf(o2).compareTo(Integer.valueOf(o1))
        );

        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++) {
            if (i % 2 == 0) {
                a += cards.get(i);
            } else {
                b += cards.get(i);
            }
        }

        System.out.println(a - b);
    }
}
