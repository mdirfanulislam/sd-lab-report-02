package c251117.c251117_practice_problem_sheet;

public class two {

    public static void main(String[] args) {
        int m[] = {50, 20, 90, 10, 70};
        int max = m[0];

        for (int i = 1; i < 5; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }

        System.out.println("Largest: " + max);
    }
}
