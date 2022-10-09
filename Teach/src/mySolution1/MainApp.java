package mySolution1;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setSize(800,800);
        frame.setLayout(new GridLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsPanel gp = new GraphicsPanel();

        /***************************************************/

        /***************************************************/



        frame.add(gp, new GridBagConstraints(0,0,1,1,1,1, GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(2,2,2,2),0,0));

        List<String> list = Arrays.asList("QQQQ","Qqwe");

        StringBuilder stringBuilder = new StringBuilder();
        for(String s : list){
            stringBuilder.append(s).append("\n");
        }
        JTextArea textArea = new JTextArea(stringBuilder.toString());
        frame.add(new JScrollPane(textArea));
        frame.setVisible(true);

    }

}
