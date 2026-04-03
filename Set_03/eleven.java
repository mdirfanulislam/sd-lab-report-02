package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class eleven {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        int tp = x * 1000;
        int tn = (int) Math.floor(tp / 100);

        System.out.println("total " + tn + " notebooks can be made out of " + x + " kg pulp");
    }
}
