package mySolution1;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {
    public  Line line;
    private Line line2;
    private Line lineMaker;
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public GraphicsPanel(){


    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        line = new Line(0,400,800,400);
        System.out.println(line.getEquation());
        int i = 0;
        line2 = new Line(400,0,400,800);
        for(i = 1; i < 800; i+=100){
            lineMaker = new Line(i,i,i+10,i+10);
            g2.draw(lineMaker);
        }
        g2.draw(line);
        g2.draw(line2);
    }
}
