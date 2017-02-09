package rectangle;

import coordCart.Point;

public class Rectangle implements Cloneable {
    private Point coinNO;
    private Point coinSE;
    
    public Rectangle(double x0, double y0, double x1, double y1) {
        coinNO = new Point(x0, y0);
        coinSE = new Point(x1, y1);
    }

    public String toString() {
        return "[" + coinNO + ";" + coinSE + "]";
    }
    
    public Rectangle clone() {
        return new Rectangle(coinNO.x(), coinNO.y(), coinSE.x(), coinSE.y());
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle r1 = new Rectangle(1, 2, 3, 4);
        Rectangle r2 = (Rectangle) r1.clone();
        System.out.println("r1: " + r1 + ", r2: " + r2);
        r1.coinNO = new Point(0, 0);
        System.out.println("r1: " + r1 + ", r2: " + r2);
        r1.coinSE.homothetie(2);
        System.out.println("r1: " + r1 + ", r2: " + r2);
        
    }
}  
