package Teach1;

public abstract class Hero {
    private Strenght strenght;
    private int agility;
    private int science;

    public Hero(Strenght strenght, int agility, int science){
        this.strenght = strenght;
        this.agility = agility;
        this.science = science;
    }

    public String getStrenght(){
        return strenght.getInfoStrenght();
    }

    public int getAgility() {
        return this.agility;
    }

    public int getScience(){
        return this.science;
    }

    public abstract String getInfoHero();
}
