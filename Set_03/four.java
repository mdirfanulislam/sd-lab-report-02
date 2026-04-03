package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class four {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        if (a == b) {
            System.out.println("c occurs once");
        } else if (a == c) {
            System.out.println("b occurs once");
        } else {
            System.out.println("a occurs once");
        }
    }
}
