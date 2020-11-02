package ABC085B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] mochiList = new int[101];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            mochiList[num]++;
        }

        int resultCount = 0;
        for (int i = 0; i < 101; i++) {
            if (mochiList[i] > 0) resultCount++;
        }

        System.out.println(resultCount);
    }
}
