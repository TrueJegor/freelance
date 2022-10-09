package Teach1;

import Teach1.Hero;

public class Main {

    public static void main(String[] args) {
        Strenght strenght = new Strenght();
        Hero[] heroes = new Hero[3];
        strenght.setValue(30);
        strenght.setQuality(100);
        heroes[0]= new Storm(strenght, 30, 60, "Storm Spirit");
        strenght.setValue(10);
        strenght.setQuality(80);
        heroes[1]= new Pudge(strenght,30,40, "Pudge");
        strenght.setValue(99);
        strenght.setQuality(101);
        heroes[2] = new Storm(strenght, 31, 61, "Storm spirit 2");



        for(int i = 0; i < heroes.length; i++){
            System.out.println(heroes[i].getInfoHero());
        }


    }
}
