package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int C = n.nextInt();

        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("B exist: " + B);
        } else {
            System.out.println("B doesn't exist");
        }
    }
}
