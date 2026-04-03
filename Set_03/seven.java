package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class seven {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int f = n.nextInt();
        int l = f + 3;

        if (l <= 10) {
            System.out.println("The boy can finish");
        } else {
            System.out.println("The boy can't finish");
        }

    }
}
