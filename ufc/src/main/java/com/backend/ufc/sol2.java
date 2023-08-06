package com.backend.ufc;

import java.util.Scanner;
import java.util.stream.IntStream;

public class sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] ar = new int[n];
            if (n - k + 1 == 1 || n - k + 1 == n) {
                printSeries(1, n + 1);
            } else {
                int cnt = n;
                int cnt2=0;
                int interval=1;
                for (int i = 0; i <n; i++) {
                    if (interval%k==0) ar[i] = ++cnt2;
                    else {
                        ar[i ] = cnt;
                        cnt -= 1;
                    }
                    interval+=1;
                }
                printSeries(0, n, ar);
            }
            System.out.println();
        }
    }

    public static void printSeries(int start, int end) {
        IntStream.range(start, end).forEach(i -> System.out.print(i + " "));
    }

    public static void printSeries(int start, int end, int[] ar) {
        IntStream.range(start, end).forEach(i -> System.out.print(ar[i] + " "));
    }
}




