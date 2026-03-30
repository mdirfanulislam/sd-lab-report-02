package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Simple_Calculator {

    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        int a = cal.nextInt();
        int b = cal.nextInt();
        char oprtr = cal.next().charAt(0);

        if (oprtr == '+') {
            System.out.println(a + b);
        } else if (oprtr == '-') {
            System.out.println(a - b);
        } else if (oprtr == '*') {
            System.out.println(a * b);
        } else if (oprtr == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
