package com.logical;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] arg)
    {
        int temp, reverse=0, read;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        read = scanner.nextInt();
        while(read != 0)
        {
            temp = read % 10;
            reverse = (reverse * 10) + temp;
            read = read / 10;
        }
        System.out.println("Reverse of a number is: " + reverse);
    }
}
