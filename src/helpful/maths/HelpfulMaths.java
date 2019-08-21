package helpful.maths;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String operationString = scanner.nextLine();

        String[] numberArr = operationString.split("\\+");
        int oneCount = 0, twoCount = 0, threeCount = 0;
        for (String numString : numberArr) {

            oneCount = numString.equalsIgnoreCase("1") ? (oneCount + 1) : oneCount;
            twoCount = numString.equalsIgnoreCase("2") ? (twoCount + 1) : twoCount;
            threeCount = numString.equalsIgnoreCase("3") ? (threeCount + 1) : threeCount;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < oneCount; i++) {
            stringBuilder.append("1+");
        }
        for (int i = 0; i < twoCount; i++) {
            stringBuilder.append("2+");
        }
        for (int i = 0; i < threeCount; i++) {
            stringBuilder.append("3+");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        System.out.println(stringBuilder);
    }
}
