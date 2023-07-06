package com.week2.src;

public class largestandsmallestnumber {
    public static void main(String[] args) {

        int numbers[] = new int[] {5,22,56,561,54,85,75,95,35,24};
                int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }

}
