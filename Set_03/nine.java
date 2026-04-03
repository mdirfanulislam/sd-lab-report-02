package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class nine {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();

        int th = (x * 4) + y;

        System.out.println("total hours per week: " + th);
    }
}
