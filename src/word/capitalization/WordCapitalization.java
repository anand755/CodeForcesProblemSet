package word.capitalization;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(capitalizedWord);
    }
}
