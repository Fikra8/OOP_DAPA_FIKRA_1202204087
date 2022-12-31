package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int pilihan = scanner.nextInt();
        Thread.sleep(500);

        switch (pilihan) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double sisi = scanner.nextDouble();
            calculation.side = sisi;
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\nThe result is: " + calculation.getSquare());
            break;

          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double newradius = scanner.nextDouble();
            calculation.radius = newradius;
            calculation.setCircle(newradius);
            calculation.run();
            System.out.println("\nThe result is: " + calculation.getCircle());
            break;

          case 3:
            System.out.print("\nEnter the upper side of the trapezoid : ");
            double a = scanner.nextDouble();
            System.out.print("Insert the side of the base of the trapezoid : ");
            double b = scanner.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\nThe result is: " + calculation.getTrapezoid());
            break;

          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption is not available");
            continue;
        }
        repeat = false;

      } catch (InputMismatchException e) {
        System.out.println("\nError: Input must be a number");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      } catch (InterruptedException e) {
        System.out.println("\nError: Thread interrupted");
      }

    } while (repeat);

    scanner.close();
  }
}