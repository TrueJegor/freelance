package OopPro;

public class Main {
    public static void main(String[] args) {

        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();    

        Actinable[] persons = {
                new Human("Jegor", 100, 3),
                new Robot("Robot", 500,3),
                new Cat("Bars", 1000, 3)
        };

       //(Actinable p : persons){
       // System.out.println(p.getInfo());
       //

        Obstaclable[] obstaclables = {
                new Wall(3),
                new Road(50),
        };

        for(int i = 0; i < persons.length; i++){
            for(int j = 0; j < obstaclables.length; j++){
                if(jumpRoll(persons[i], obstaclables[j]) == true){
                    System.out.println(persons[i].getName() + " jump done");
                    if(runRoll(persons[i], obstaclables[j]) == false){
                        System.out.println(persons[i].getName() + " run done");
                        j++;
                    }else{
                        System.out.println(persons[i].getName() + " run no done. He end this competition");
                    }
                }else{
                    System.out.println(persons[i].getName() + " jump no done. He end this competition");
                    j++;
                }
            }
        }

        long actualMemUsed=afterUsedMem-beforeUsedMem;
        System.out.println(actualMemUsed);
    }

    public static boolean jumpRoll(Actinable actinable, Obstaclable wall){
        if(actinable.getHeihtLenght() >= wall.getHeight()){
            //System.out.println(actinable.getName() +" jump via wall, she's height: " + wall.getLenght());
            return true;
        }else{
            //System.out.println(actinable.getName() + " could not jump to " + wall.getLenght() + " because his skills " + actinable.getHeihtLenght());
            return false;
        }
    }

    public static boolean runRoll(Actinable actinable, Obstaclable road){
        if(actinable.getDistanceLenght() >= road.getLenght()){
            //System.out.println(actinable.getName() + "running via road, she's lenght: " + road.getHeight());
            return true;
        }else{
            //System.out.println(actinable.getName() + " could not jump to " + road.getHeight() + " beacuse his skills " + actinable.getHeihtLenght());
            return false;
        }
    }
}
