package com.company;

import java.util.Scanner;

public class Cupboard extends  Furniture{
    private String model;
    private int height;
    private boolean mirror;

    public Cupboard(){
        super();
        model = "";
        height = 0;
        mirror = false;
    }

    public Cupboard(int costArg, int valueArg, String modelArg, int heightArg, boolean mirrorArg){
        super(costArg, valueArg);
        model = modelArg;
        height = heightArg;
        mirror = mirrorArg;
    }

    public void setModel(String modelArg){
        model = modelArg;
    }

    public void setHeight(int heightArg){
        height = heightArg;
    }

    public void setMirror(boolean mirrorArg){
        mirror = mirrorArg;
    }

    public String getModel(){
        return model;
    }

    public int getHeight(){
        return height;
    }

    public boolean getMirror(){
        return mirror;
    }

    public void setAllinfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фирму производителя шкафа:");
        String name = in.next();
        setModel(name);

        System.out.println("Введите высоту шкафа:");
        int height = in.nextInt();
        setHeight(height);

        System.out.println("Введите есть ли у шкафа зеркало (true/false)");
        mirror = in.nextBoolean();
        setMirror(mirror);
    }

    public String toString(){
        return "\n\tШкаф " + "\n\t" + "Фирма: " + getModel() + "\n\t" + "Максимальная высота " + getHeight()
                + "\n\tЗеркало " + getMirror() + "\n\t" + "Модель " + model + "\n\t" + "Высота " + height
                + "\n\t" + "Зеркало " + mirror;
    }
}
