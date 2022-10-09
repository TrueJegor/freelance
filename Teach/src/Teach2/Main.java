package Teach2;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.time.*;
import java.util.Arrays;
import java.util.Date;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] planets = new String[] {
                "Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn",
                "Uranus", "Neptune"
        };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by lenght: ");
        Arrays.sort(planets,(first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
