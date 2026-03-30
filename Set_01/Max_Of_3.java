package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Max_Of_3 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Max = " + max);
    }
}
