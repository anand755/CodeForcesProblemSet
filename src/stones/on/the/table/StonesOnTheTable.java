package stones.on.the.table;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStoneCount = scanner.nextInt();
        scanner.nextLine();
        String stoneColors = scanner.nextLine();

        int rCount = 0;
        while (stoneColors.contains("RR")) {
            stoneColors = stoneColors.replaceFirst("RR", "R");
            rCount++;
        }

        int gCount = 0;
        while (stoneColors.contains("GG")) {
            stoneColors = stoneColors.replaceFirst("GG", "G");
            gCount++;
        }

        int bCount = 0;
        while (stoneColors.contains("BB")) {
            stoneColors = stoneColors.replaceFirst("BB", "B");
            bCount++;
        }

        System.out.println(rCount + gCount + bCount);
    }
}
