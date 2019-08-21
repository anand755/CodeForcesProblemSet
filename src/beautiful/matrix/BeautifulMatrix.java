package beautiful.matrix;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[5][5];
        int curr1_i = 0, curr1_j = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = scanner.nextInt();
                if (mat[i][j] == 1) {
                    curr1_i = i;
                    curr1_j = j;
                }
            }
        }

        int iMove = 0, jMove = 0;

        iMove = ((curr1_i - 2) > 0) ? (curr1_i - 2) : (2 - curr1_i);
        jMove = ((curr1_j - 2) > 0) ? (curr1_j - 2) : (2 - curr1_j);

        System.out.println(iMove + jMove);

    }
}
