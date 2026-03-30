package c251117.c251117_practice_problem_sheet;

public class six {

    public static void main(String[] args) {
        int t[] = {10, 20, 30, 40};
        int target = 30;
        boolean found = false;

        for (int i=0; i<4; i++) {
            if (t[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Targeted Number " + target + " Found" : "Targeted Number Not Found");
    }
}
