package week3;

class Blocks {
    public int length, width, height;
    
    public Blocks(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    
    public int countVolume() {
        return length * width * height;
    }
}