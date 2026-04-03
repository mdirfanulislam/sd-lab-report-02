package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class twelve {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int x = n.nextInt();

        int mn = (4 * a) - x;
        int tptb = 0;

        if (mn > 0) {
            tptb = (int) Math.ceil((double) mn / 4);

            System.out.println("packets must buy is: " + tptb);
        } else {
            System.out.println("the iiucian has enough");
        }
    }
}
