package week3;


public class ArrayOfBlocks {
    public static void main(String[] args) {
        Blocks[] blArray = new Blocks[3];
        
        blArray[0] = new Blocks(10, 10, 10);
        blArray[1] = new Blocks(10, 10, 20);
        blArray[2] = new Blocks(20, 15, 25);
        
        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume blocks - " + i + " = " + blArray[i].countVolume());
        }
    }
}
