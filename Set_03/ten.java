package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class ten {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int B1 = n.nextInt();
        int B2 = n.nextInt();
        int B3 = n.nextInt();

        if (B1 + B2 == 0) {
            System.out.println("Water filling time");
        } else if (B2 + B3 == 0) {
            System.out.println("Water filling time");
        } else if (B1 + B3 == 0) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
    }
}
