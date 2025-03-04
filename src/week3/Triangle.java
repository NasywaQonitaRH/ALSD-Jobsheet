package week3;

class Triangle {
    int base, height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }

    public Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }

    public double countArea() {
        return 0.5 * base * height;
    }

    public double countPerimeter() {
        double side = Math.sqrt((base / 2.0) * (base / 2.0) + height * height);
        return 2 * side + base;
    }
}