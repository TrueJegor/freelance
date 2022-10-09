package com.company;

public class Furniture {
    private int cost; //закрытый член класса, содержащий стоимость мебели
    private int value; //закрытый член класса, содержащий количество мебели
    private String name; //закрытый член класса, содержащий имя мебели

    public void setCost(int costArg){ //открытая функция (метод класс) для задания значения
        cost = costArg; // стоимости
    }

    public int getCost(){ //открытая функция (метод класс) для вывода значения
        return cost; //стоимости мебели
    }

    public void setValue(int valueArg){ //открытая функция (метод класс) для задания значения
        value = valueArg; //количества
    }

    public int getValue(){ //открытая функция (метод класс) для вывода значения
        return value; //количества мебели
    }

    public void setName(String nameArg){ //открытая функция (метод класс) для задания значения
        name = nameArg; //названия мебели
    }

    public String getName(){ //открытая функция (метод класс) для вывода значения
        return name; //названия мебели
    }

    public Furniture(){ //конструктор класса (без параметров)
        cost = 0;
        value = 0;
        name = "Без имени";
    }

    public Furniture(int costArg, int valueArg){ //конструктор класса (с параметрами)
        cost = costArg;
        value = valueArg;
    }
}
