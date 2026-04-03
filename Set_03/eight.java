package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        int ts = a * b;
        double per = ((double) c / ts) * 100;

        if (per > 50) {
            System.out.println("Passed studnets is greater than 50%");
        } else {
            System.out.println("Passed studnets is not greater than 50%");
        }
    }
}
