package OopPro;

public class Wall implements Obstaclable{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
