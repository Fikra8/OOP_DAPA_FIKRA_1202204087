package Java;

public class Calculation implements Runnable {
    protected double radius;
    protected double side;
    protected double area;
    protected final double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("\njava.lang.IllegalArgumentException\nThe value must be greater than 0");
      }
      this.side = side;
      this.area = side * side;
    }

    public double getSquare() {
      return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("The value must be greater than 0");
      }
      this.area = phi * radius * radius;
    }

    public double getCircle() {
      return this.area;
    }

    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
      if (a < 1 || b < 1 || t < 1) {
        throw new IllegalArgumentException("The value must be greater than 0");
      }
      this.area = ((a + b) * t) / 2;
    }

    public double getTrapezoid() {
      return this.area;
    }

    @Override
    public void run() {
      System.out.println("\n====Program will start in====");
      for (int i = 5; i > 0; i--) {
        try {
          System.out.println("Starting in "+ i);
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println("Error");
        }
      }
    }
  }