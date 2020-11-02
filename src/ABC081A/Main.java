package ABC081A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c = 0;
        if(str.charAt(0) == '1') c++;
        if(str.charAt(1) == '1') c++;
        if(str.charAt(2) == '1') c++;
        System.out.println(c);
    }
}
