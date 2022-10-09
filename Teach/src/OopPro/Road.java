package OopPro;

public class Road implements Obstaclable{
    private int lenght;

    public Road(int lenght){
        this.lenght = lenght;
    }
    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
