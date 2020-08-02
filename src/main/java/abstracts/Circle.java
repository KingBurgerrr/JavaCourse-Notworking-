package abstracts;

public class Circle {
    private int rad;
    private int diam;

    public int getRad() {
        return rad;
    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getDiam() {
        return diam;
    }
    public void setDiam(int diam) {
        this.diam = diam;
    }
    public Circle(int rad, int diam) {
        this.rad = 3;
        this.diam = 9;
    }
    public double area() {
        return 3.14 * getDiam();
    }
    public double lenght() {
        return (3.14 * 2) * getRad();
    }
}
