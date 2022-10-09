package mySolution1;

public class Fraction {
    private double numerator;
    private double denumerator;
    private Point p1;
    private Point p2;

    public Fraction(double numerator, double denumerator){
        this.numerator = numerator;
        this.denumerator = denumerator;
    }

    public double getDenumeratorX() {
        return -p1.getX();
    }

    public double getNumeratorX() {
        return p1.getX() - p2.getX();
    }

    public double getDenumeratorY() {
        return -p1.getY();
    }

    public double getNumeratorY() {
        return p1.getY() - p2.getY();
    }
}
