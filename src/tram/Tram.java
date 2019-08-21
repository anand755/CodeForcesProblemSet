package tram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stopCount = scanner.nextInt();
        List<Integer> exitList = new ArrayList<>();
        List<Integer> enterList = new ArrayList<>();

        for (int i = 0; i < stopCount; i++) {
            exitList.add(scanner.nextInt());
            enterList.add(scanner.nextInt());
        }
        List<Integer> flowList = new ArrayList<>();
        for (int i = 0; i < stopCount; i++) {
            int flow = enterList.get(i) - exitList.get(i);
            flowList.add(flow);
        }

        int maxCapacity = 0;
        int asOfTotal = 0;
        for (int i = 0; i < flowList.size(); i++) {
            asOfTotal = asOfTotal + flowList.get(i);
            if (asOfTotal > maxCapacity) {
                maxCapacity = asOfTotal;
            }
        }
        System.out.println(maxCapacity);
    }
}