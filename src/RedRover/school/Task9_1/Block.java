package RedRover.school.Task9_1;

public class Block {
    int width, length, height = 0;

    public Block(int[] i) {
        this.width = i[0];
        this.length = i[1];
        this.height = i[2];
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.height * this.length * this.width;
    }

    public int getSurfaceArea() {
        int a = getWidth();
        int b = getLength();
        int c = getHeight();

        return 2 * (a * b + b * c + c * a);

    }

    public static void main(String[] arg) {
        Block b = new Block(new int[]{2, 2, 2});

    }
}
