package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int index = 0;
        int rest = money - price;
        while (rest > 0) {
            if (rest - coins[index] >= 0) {
                rsl[size] = coins[index];
                rest -= coins[index];
                size++;
            } else {
                index++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
