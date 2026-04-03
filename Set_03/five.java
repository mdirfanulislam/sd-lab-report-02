package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class five {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        double Average = ((double) a + b) / 2;

        if (Average > c) {
            System.out.println("Average of A and B is greater than C");
        } else {
            System.out.println("Average of A and B is not greater than C");
        }
    }
}
