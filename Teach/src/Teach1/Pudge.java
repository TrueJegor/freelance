package Teach1;

import Teach1.Hero;

public class Pudge extends Hero {
    private String name;

    public Pudge(Strenght strength, int agility, int science, String name){
        super(strength, agility, science);
        this.name = name;
    }

    @Override
    public String getInfoHero(){
        return ("Strength: " + this.getStrenght() + "\n Agility: " + this.getAgility()
                + "\n Science: " + this.getScience() + "\n and his name is: " + this.name);
    }

}
