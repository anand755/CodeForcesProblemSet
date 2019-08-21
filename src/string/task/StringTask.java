package string.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase();
        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
        for (char ch : word.toCharArray()) {
            if (!vowelList.contains(ch)) {
                System.out.print("." + ch);
            }
        }
    }
}
