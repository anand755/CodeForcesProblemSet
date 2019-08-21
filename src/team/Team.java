package team;

import java.util.*;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        Map<Integer, Integer> confidenceMap = new HashMap<>();

        int result = 0;
        for (int testcase = 1; testcase <= testCaseCount; testcase++) {
            int p = scanner.nextInt();
            int v = scanner.nextInt();
            int t = scanner.nextInt();

            int currConfidence = p + v + t;

            if (currConfidence>=2){
                result++;
            }
        }
        System.out.println(result);
    }
}


