package c251117.c251117_practice_problem_sheet;

public class three {

    public static void main(String[] args) {
        int mn[] = {12, 22, 49, 11, 37};
        int min = mn[0];

        for (int i = 1; i < 5; i++) {
            if (mn[i] < min) {
                min = mn[i];
            }
        }

        System.out.println("Smallest: " + min);
    }
}
