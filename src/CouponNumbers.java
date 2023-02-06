package com.logical;

public class CouponNumbers {

    // return a random coupon between 0 and n-1
    public static int getCoupon(int number) {
        return (int) (Math.random() * number);
    }

    // return number of cards you collect before obtaining one of each of the n types
    public static int collect(int number) {
        boolean[] isCollected = new boolean[number];
        int count = 0;
        int distinct  = 0;

        // repeat until you've collected all n card types
        while (distinct < number) {
            int value = getCoupon(number);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

    // test client
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int count = collect(number);
        System.out.println(count);
    }
}
