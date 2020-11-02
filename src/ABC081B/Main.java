package ABC081B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        int count = 0;
        while (isDiviable(list)) {
            count++;
            list = division(list);
        }

        System.out.println(count);
    }

    private static boolean isDiviable(List<Integer> list) {
        boolean isDiviable = true;
        for (Integer num : list) {
            if(num % 2 != 0) isDiviable = false;
        }
        return isDiviable;
    }

    private static List<Integer> division (List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        list.forEach( num -> resultList.add(num/2) );
        return resultList;
    }
}
