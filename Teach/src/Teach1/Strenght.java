package Teach1;

public class Strenght {
    private int value;
    private int quality;

    public Strenght(){
        this.value = 0;
        this.quality = 0;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setQuality(int quality){
        this.quality = quality;
    }

    public String getInfoStrenght(){
        return "Value Strenght: " + this.value + "Quality Strenght: " + this.quality;
    }
}
