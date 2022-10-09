package jegor;

public class Line{
    private Point oneP;
    private Point twoP;

    public Line(Point oneP, Point twoP) {
        this.oneP = oneP;
        this.twoP = twoP;
    }

    public Point getFirstPoint() {
        return oneP;
    }

    public Point getSecondPoint() {
        return twoP;
    }

    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow((p2.getY() - p1.getY()),2));
    }

}
