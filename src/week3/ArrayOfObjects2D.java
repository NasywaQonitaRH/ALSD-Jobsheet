package week3;

class Square {
    int side;

    public Square(int s) {
        this.side = s;
    }

    public int getArea() {
        return side * side;
    }
}

public class ArrayOfObjects2D {
    public static void main(String[] args) {
        Square[][] squares = new Square[2][2]; // 2x2 array of Squares

        squares[0][0] = new Square(4);
        squares[0][1] = new Square(5);
        squares[1][0] = new Square(6);
        squares[1][1] = new Square(7);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Square[" + i + "][" + j + "] Area: " + squares[i][j].getArea());
            }
        }
    }
}