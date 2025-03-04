package week3;

public class ArrayOfBlocks {
    public static void main(String[] args) {
        Blocks[] blArray = new Blocks[3];

        blArray[0] = new Blocks(10, 12, 300);
        blArray[1] = new Blocks(10, 12, 600);
        blArray[2] = new Blocks(20, 25, 250);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + i + " = " + blArray[i].countVolume());
        }
    }
}