package coordCart;

public class Point {

private double x, y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double x() {
        return x;
    }
    public double y() {
        return y;
    }
    public double r() {
        return Math.sqrt(x * x + y * y);
    }
    public double t() {
        return Math.atan2(y, x);
    }
    
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public boolean equals(Object o) {
        return o instanceof Point && ((Point) o).x == x && ((Point) o).y == y;
    }
    
    public void homothetie(double k) {
        x *= k;
        y *= k;
    }
    public void translation(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void rotation(double a) {
        double r = r();
        double t = t() + a;
        x = r * Math.cos(t);
        y = r * Math.sin(t);
    }
    
    /* une meilleure version (pour ceux qui ont de beaux restes en maths...) 
    public void rotation(double a) {
        double sina = Math.sin(a);
        double cosa = Math.cos(a);
        double y1 = x * sina + y * cosa;
        x = x * cosa - y * sina;
        y = y1;
    } */
}  
