package com.array;

import java.util.Scanner;

public class FillArrayFromKeyboard {
    public static void main(String[] args) {
        // Assuming array is already declared and initialized
        int[] array = new int[10]; // Adjust the size of the array as needed

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter integers for each element of the array
        System.out.println("Enter " + array.length + " integers:");

        // Loop through the array and fill it with integers from the keyboard
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Close the Scanner object
        scanner.close();

        // Display the filled array
        System.out.println("Array filled with integers:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
