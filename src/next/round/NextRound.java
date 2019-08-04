package next.round;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;

        int compareVal = arr[k - 1];

        for (int ar : arr) {
            if ((ar > 0) && (ar >= compareVal)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
