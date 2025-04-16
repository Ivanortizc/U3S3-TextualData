package com.codedifferently.labs.partA;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Ivan";
        String itemDesc = "Car";
        String message;

        double price = 30_000;
        double tax = 0.10;
        int quantity = 2;
        double totalPrice = price * quantity*(1+tax);

        message = custName +" wants to purchase "+ quantity + " " + itemDesc;

        System.out.println(message);
        System.out.println("Total cost with tax is:$"+ totalPrice);


    }
}
    public class MoneyEchangeBasic {

        public static void main(String[]args) {
            System.out.print("Money Exchange");
            
        }
    }