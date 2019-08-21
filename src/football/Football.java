package football;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String players = scanner.nextLine();

        String teamOne = "1111111";
        String teamZero = "0000000";

        if (players.contains(teamOne) || players.contains(teamZero)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
