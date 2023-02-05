package com.logical;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[])
    {
        long read, sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        read=scanner.nextLong();
        int i=1;
//executes until the condition becomes false
        while(i <= read/2)
        {
            if(read % i == 0)
            {
//calculates the sum of factors
                sum = sum + i;
            } //end of if
//after each iteration, increments the value of variable i by 1
            i++;
        } //end of while
//compares sum with the number
        if(sum==read)
        {
//prints if sum and n are equal
            System.out.println(read+" is a perfect number.");
        } //end of if
        else
//prints if sum and n are not equal
            System.out.println(read+" is not a perfect number.");
    }
}
