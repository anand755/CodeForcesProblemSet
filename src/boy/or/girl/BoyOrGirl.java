package boy.or.girl;

import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        List<Character> distinctCharList = new ArrayList<>();
        for (Character character : userName.toCharArray()) {
            if (!distinctCharList.contains(character)) {
                distinctCharList.add(character);
            }
        }
        int distinctCharLength = distinctCharList.size();

        if (distinctCharLength % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
