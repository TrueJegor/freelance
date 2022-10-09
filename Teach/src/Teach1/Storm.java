package Teach1;

import Teach1.Hero;

public class Storm extends Hero {

    String name;
    public Storm(Strenght strenght, int agility, int science, String name){
        super(strenght, agility, science);
        this.name = name;
    }

    @Override
    public String getInfoHero(){
        return ("Strenght: " + this.getStrenght() +"\n"+ "Agility: " + this.getAgility() +
                "Science: " + this.getScience() + "\n" + "And his name is " + this.name );
    }
}
