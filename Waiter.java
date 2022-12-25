package Java;

public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int GacoanPrice = 20900;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getGacoan();
            try {
                Thread.sleep(12000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of gacoan: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * GacoanPrice);
        System.out.println("==========================================================");
    }

    public void getGacoan() {
        synchronized(GacoanMaker.getLock()) {
            System.out.println("Waiter: Gacoan is ready to deliver");
            GacoanMaker coffeeMachine = new GacoanMaker();
            coffeeMachine.setWaitingForPickup(false);
            
            if (GacoanMaker.getGacoanNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            GacoanMaker.getLock().notifyAll();
            System.out.println("Waiter: Tell the gacoan maker to make another Gacoan\n");

        }
    }
}