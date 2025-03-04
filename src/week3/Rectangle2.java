package week3;

public class Rectangle2 {
    int length;
    int width;

    public Rectangle2() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }
}