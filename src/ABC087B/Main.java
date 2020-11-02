package ABC087B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        for (int ai=0; ai<=a; ai++) {
            for (int bi=0; bi<=b; bi++) {
                for (int ci=0; ci<=c; ci++) {
                    if (500*ai + 100*bi + 50*ci == x) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
