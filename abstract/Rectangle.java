package main;

public class Rectangle {
    private int high;
    private int wight;

    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        this.high = high;
    }
    public int setWidht(){
        return wight;
    }
    public void setWight(int wight) {
        this.wight = wight;
    }
    public Rectangle(int high, int wight){
        this.high = 9;
        this.wight = 12;
    }
    public int square(){
        return getHigh() * wight;
    }
}

