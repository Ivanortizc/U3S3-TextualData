package com.codedifferently.labs.partB;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] currencies = {"US Dollars", "Euros", "British Pounds", "Indian Rupees", "Japanese Yen","Chinese Yuan Renminbi"};
        double[] rates = {1.00,0.94,0.82,68.32,115.84,6.92};

        System.out.println("Please Select Your Starting Currency:");
        for(int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ": " + currencies[i]);
        }
        int fromChoice = scanner.nextInt();

        System.out.println("Please enter the amount in " + currencies[fromChoice - 1] + ":");
        double amount = scanner.nextDouble();


        System.out.println("Please Select Currency to transfer to:");
        for(int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ": " + currencies[i]);
        }
        int toChoice = scanner.nextInt();


        double usdAmount = amount / rates[fromChoice - 1];
        double convertedAmount = usdAmount * rates[toChoice - 1];

        System.out.printf("\nConversion Result:\n" +
                        "%.2f %s → %.2f %s\n",
                amount, currencies[fromChoice - 1],
                convertedAmount, currencies[toChoice - 1]);
    }


        }
    
