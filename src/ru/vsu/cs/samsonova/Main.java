package ru.vsu.cs.samsonova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = putElementsValues(n);
        System.out.println(result);
    }

    public static double putElementsValues(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += calculateElementsValues(i);
        }
        return result;
    }

    private static double calculateElementsValues(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 0.625;
        }
        return 0.5 * calculateElementsValues(i - 1) + 0.75 * calculateElementsValues(i - 2);
    }
}
