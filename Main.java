package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GacoanMaker machine = new GacoanMaker();
        int customerID, orderQty = 0;

        System.out.println("Enter Customer ID: ");
        customerID = input.nextInt();

        try {
            System.out.println("Enter how much gacoan you want: ");
            orderQty = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter only integer");
            System.exit(0);
        }

        Thread t1 = new Thread(machine);
        Waiter waiter = new Waiter(customerID, orderQty);
        Thread t2 = new Thread(waiter);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

