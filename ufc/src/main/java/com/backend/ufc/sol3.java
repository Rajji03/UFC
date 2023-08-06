package com.backend.ufc;

import java.util.*;
import java.util.stream.IntStream;

import java.util.Scanner;

public class sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading t

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character after reading n
            String s = sc.nextLine();

            int[] pos = new int[]{0, 0};
            boolean flag = s.chars()
                    .mapToObj(c -> (char) c)
                    .anyMatch(ch -> {
                        updatePosition(pos, ch);
                        return !reachedDestination(pos);
                    });

            System.out.println(flag ? "YES" : "NO");
        }
    }

    private static void updatePosition(int[] pos, char direction) {
        if (direction == 'U')
            pos[1] += 1;
        else if (direction == 'D')
            pos[1] -= 1;
        else if (direction == 'L')
            pos[0] -= 1;
        else if (direction == 'R')
            pos[0] += 1;
    }

    private static boolean reachedDestination(int[] pos) {
        return pos[0] == 1 && pos[1] == 1;
    }
}
