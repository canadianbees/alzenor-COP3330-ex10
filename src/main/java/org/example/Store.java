package org.example;
import java.util.Scanner;

public class Store
{
    private double sum;

    public Store()
    {
        this.sum = 0.00;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many items are you purchasing today? ");
        int numItems = scan.nextInt();
        System.out.print("\n");

        for(int i = 1; i <= numItems; i++)
        {
            System.out.print("Enter the price of item "+i+": ");
            int price = scan.nextInt();

            System.out.print("Enter the quantity of item "+i+": ");
            int quantity = scan.nextInt();

            sum += price * quantity;

        }
    }

    public void Checkout()
    {
        float tax = (float) ((sum*.055));
        System.out.println("Subtotal: $"+sum);
        System.out.println("Tax: $"+tax);

        float total = (float) (tax + sum);

        System.out.println("Total: $"+total);

    }
}
