public class BallThread extends Thread {
    private BallItem twin;
    private volatile boolean isSuspended;
    private volatile boolean isRunning = true;
    public void setTwin(BallItem twin){
        this.twin = twin;
    }
    public void run() {
        while (isRunning) {
            if (!isSuspended) {
                twin.draw();
                twin.move();
                System.out.println();
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void suspendMe() {
        isSuspended = true;
        System.out.println("Begin to suspend BallThread\n");
    }

    public void resumeMe() {
        isSuspended = false;
        System.out.println("Begin to resume BallThread\n");
    }

    public void stopMe() {
        this.isRunning = false;
        this.isSuspended = true;
    }
}
