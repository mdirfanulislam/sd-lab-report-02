package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Java_User_Input {

    public static void main(String[] args) {
        Scanner nam = new Scanner(System.in);

        String name = nam.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
