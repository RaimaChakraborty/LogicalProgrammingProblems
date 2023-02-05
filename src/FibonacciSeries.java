package com.logical;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num , firstTerm = 0, secondTerm = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        num = scanner.nextInt();

        System.out.println("Fibonacci Series till " + num + " terms:");

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
