package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class thirteen {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        int C = n.nextInt();
        int x = n.nextInt();

        if (x == A || x == B || x == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
