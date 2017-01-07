package angryprofessor;

import java.util.Scanner;

/**
 * Created by rnealis on 1/7/17.
 */
public class Solution {

    private static String classHappening(int thresh, int[] arrivalTimes) {
        int onTime = 0;
        for (int arrival: arrivalTimes) {
            if (arrival <= 0) {
                onTime += 1;
            }
        }

        if (onTime >= thresh) {
            // the class is not cancelled
            return "NO";
        } else {
            // the class is cancelled
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int testCases = scan.nextInt();
        String[] answers =  new String[testCases];

        for (int i = 0; i < testCases; i++ ) {

            int students = scan.nextInt();
            int thresh = scan.nextInt();

            int[] arrivalTimes = new int[students];

            for (int j = 0; j < students; j++) {
                arrivalTimes[j] = scan.nextInt();
            }

            answers[i] = classHappening(thresh, arrivalTimes);
        }

        for (String answer: answers) {
            System.out.println(answer);
        }
    }
}
