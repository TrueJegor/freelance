package com.company;

import java.util.ArrayList;

public class Room {
    private ArrayList <Furniture> roomFurniture = new ArrayList<Furniture>(); //массив с мебелью

    public Room() {

    }

    public void addFur(Furniture f){
        roomFurniture.add(f);
    }

    public boolean findFur(Furniture f){
        return roomFurniture.contains(f);
    }

    public Room(ArrayList<Furniture> f){
        roomFurniture = f;
    }

    public void printCupboardRoom(){
        for(Furniture f : roomFurniture){
            if(f instanceof Cupboard){
                System.out.println("Это шкаф");
            }
        }
    }

    public void printSofaRoom(){
        for(Furniture f : roomFurniture){
            if(f instanceof Sofa){
                System.out.println("Это диван");
            }
        }
    }

    public void printRoom(){
        System.out.println("В комнате имеются:");
        for(Furniture f: roomFurniture){
            System.out.println("\t" + f.toString());
        }
    }
}
