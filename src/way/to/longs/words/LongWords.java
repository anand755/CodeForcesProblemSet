package way.to.longs.words;

import java.util.Scanner;

public class LongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[testCount];
        for (int i = 0; i < testCount; i++) {
            words[i] = scanner.nextLine();
        }

        for (String word : words) {
            if (word.length() > 10) {
                int middleCharLength = word.length() - 2;
                System.out.println(word.charAt(0) + "" + middleCharLength + "" + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
