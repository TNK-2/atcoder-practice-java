package ABC083B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        for (int i=1; i<=n; i++) {
            if (isAddable(a,b,i)) {
                result += i;
            }
        }

        System.out.println(result);
    }

    private static Boolean isAddable(int a, int b, int num) {
        int total = 0;
        int tmp = num;

        while (tmp != 0) {
            total += tmp%10;
            tmp = tmp/10;
        }

        if (a<=total && total<=b) {
            return true;
        } else {
            return false;
        }
    }
}
