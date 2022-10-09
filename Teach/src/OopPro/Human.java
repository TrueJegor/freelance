package OopPro;

public class Human implements Actinable{
    private String name;
    private int distanceLenght;
    private int heihtLenght;

    public Human(String name, int distanceLenght, int heihtLenght){
        this.name = name;
        this.distanceLenght = distanceLenght;
        this.heihtLenght = heihtLenght;
    }
    @Override
    public void run() {
        System.out.println("Human run a " + distanceLenght);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDistanceLenght() {
        return distanceLenght;
    }

    @Override
    public int getHeihtLenght() {
        return heihtLenght;
    }

    @Override
    public void jump() {
        System.out.println("Human jump a " + heihtLenght);
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " Height: " + heihtLenght +" Lenght: " + distanceLenght;
    }
}
