package bit.plus.plus;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount = scanner.nextInt();

        int result = 0;
        while (testCaseCount-- >= 0) {
            String statement = scanner.nextLine();

            if (statement.contains("++")) {
                result++;
            } else if (statement.contains("--")) {
                result--;
            }
        }

        System.out.println(result);
    }
}
