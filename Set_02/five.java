package c251117.c251117_practice_problem_sheet;

public class five {

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        int even = 0, odd = 0;

        for (int i=0; i<5; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
