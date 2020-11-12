package ru.vsu.cs.samsonova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = putValuesOfElements(n);
        System.out.println(result);
    }

    public static double putValuesOfElements(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += calculateValuesOfElements(i);
        }
        return result;
    }

    private static double calculateValuesOfElements(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 0.625;
        }
        return 0.5 * calculateValuesOfElements(i - 1) + 0.75 * calculateValuesOfElements(i - 2);
    }
}
