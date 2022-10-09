package OopPro;

public class Cat implements Actinable{
    String name;
    int distanceLenght;
    int heihtLenght;

    public Cat(String name, int distanceLenght, int heihtLenght){
        this.name = name;
        this.distanceLenght = distanceLenght;
        this.heihtLenght = heihtLenght;
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
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public String getInfo() {
        return "Name: " + name + " Height: " + heihtLenght +" Lenght: " + distanceLenght;    }
}
