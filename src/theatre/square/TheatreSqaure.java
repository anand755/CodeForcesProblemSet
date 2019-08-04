package theatre.square;

import java.util.Scanner;

public class TheatreSqaure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long a = scanner.nextInt();

        long resultN, resultM, result;

        if (n % a >= 1) {
            resultN = n / a + 1;
        } else {
            resultN = n / a;
        }

        if (m % a >= 1) {
            resultM = m / a + 1;
        } else {
            resultM = m / a;
        }

        if (n == m && m == a) {
            result = 1;
        } else {
            result = resultM * resultN;
        }
        System.out.println(result);
    }
}
