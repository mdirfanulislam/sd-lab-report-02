package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class fifteen {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        int C = n.nextInt();

        int hMR = Math.max(A, C);

        if (hMR <= B) {
            System.out.println("Agree on some temperatures");
        } else {
            System.out.println("Can't agree on some temperatures");
        }
    }
}
