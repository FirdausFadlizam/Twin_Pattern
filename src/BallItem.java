
public class BallItem extends GameItem {
    private boolean isSuspended;
    private BallThread twin;
    public void setTwin (BallThread twin){
        this.twin = twin;
    }
    @Override
    public void doDraw() {
        System.out.println("DoDraw a ball");
    }
    public void move() {
        System.out.println("Move the ball");
    }
    @Override
    public void click() {
        isSuspended = !isSuspended;
        if (isSuspended) {
            twin.suspendMe();
        } else {
            twin.resumeMe();
        }
    }
}
