package jegor;

public class MainApp {
    public static void main(String[] args) {
        //points first line
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,1);
        //points second line
        Point p3 = new Point(0, 2);
        Point p4 = new Point(2,0);
        //lines
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        printStraight(p1);
        straightLine(line1);
    }

    public static void printStraight(Point p){
        System.out.println(p.getX() + "x " + p.getY() + "y = 0");
    }

    static double pointX = 0;
    static double pointY = 0;
    public static void straightLine(Line line){
        try {
            pointX = -line.getFirstPoint().getX() / (line.getSecondPoint().getX() - line.getFirstPoint().getX());
        }catch (ArithmeticException e) {}
        try{
            pointY = -line.getSecondPoint().getY() / (line.getSecondPoint().getY() - line.getFirstPoint().getY());
        }catch (ArithmeticException e){}
        System.out.println(pointX + "x +" + pointY + " y = 0");
    }


}
