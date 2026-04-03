package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class fourteen {

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        Scanner helper = new Scanner(System.in);
        int P = helper.nextInt();
        int Q = helper.nextInt();
        int R = helper.nextInt();
        int S = helper.nextInt();

        if (P > sum(Q, R, S)) {
            System.out.println("A monopoly in the market because of A");
        } else if (Q > sum(P, R, S)) {
            System.out.println("A monopoly in the market because of B");
        } else if (R > sum(P, Q, S)) {
            System.out.println("A monopoly in the market because of C");
        } else if (S > sum(P, Q, R)) {
            System.out.println("A monopoly in the market because of D");
        } else {
            System.out.println("No monopoly in the market");
        }
    }
}
