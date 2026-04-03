package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class six {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();

        double tSubs = (double) x / 6;
        int tCost = (int) Math.ceil(tSubs) * y;

        System.out.println("Total Cost of Subscription: " + tCost);

        n.close();
    }
}
