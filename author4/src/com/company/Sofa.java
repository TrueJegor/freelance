package com.company;

public class Sofa  extends Furniture{
    private String model;
    private int valueMan;

    public Sofa(){
        super(); //вызываем конструктор класса-родителя без параметров
        model = ""; //добавляем инициализацию новых членов
        valueMan = 4;
    }

    public Sofa(int costArg, int valueArg, String modelArg, int valueManArg){
        super(costArg, valueArg); //вызываем конструктор класса-родителя с параметрами
        valueMan = valueManArg;// добавляем инициализацию новых членов
        model = modelArg;
    }

    public void setModel(String modelArg){
        model = modelArg;
    }

    public String getModel(){
        return model;
    }

    public void setValueMan(int valueManArg){
        valueMan = valueManArg;
    }

    public int getValueMan(){
        return valueMan;
    }

    public String toString(){
        return getModel() + " " + getValueMan() +" " + getCost() ;
    }
}
