package petya.and.strings;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine().toLowerCase();
        String secondString = scanner.nextLine().toLowerCase();

        int result = 0;
        if (firstString.equals(secondString)) {
            result = 0;
        }

        if (firstString.compareTo(secondString) < 0) {
            result = -1;
        } else if (firstString.compareTo(secondString) > 0) {
            result = 1;
        }

        System.out.println(result);

    }
}
