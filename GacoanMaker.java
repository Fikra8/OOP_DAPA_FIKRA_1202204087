package Java;

public class GacoanMaker implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int gacoanNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeMie();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getGacoanNumber() {
        return gacoanNumber;
    }

    public void makeMie() {
        synchronized(GacoanMaker.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Gacoan Maker: Waiting for the Waiter to deliver the gacoan");
                    GacoanMaker.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Gacoan Machine: Making gacoan Number " + gacoanNumber++);
            GacoanMaker.lock.notifyAll();
            System.out.println("Gacoan Machine: Telling the waiter to get the Gacoan\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}
