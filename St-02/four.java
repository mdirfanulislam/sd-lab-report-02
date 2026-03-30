package c251117.c251117_practice_problem_sheet;

public class four {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i=0; i<5; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / 5;
        System.out.println("Average: " + avg);
    }
}
