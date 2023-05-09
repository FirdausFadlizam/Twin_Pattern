
public abstract class GameItem {


    public void draw() {
        System.out.println("Draw");
        doDraw();
    }

    public abstract void doDraw();


    public abstract void click();
}







