package Collections1;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxFruits <T extends Fruit>{
    private ArrayList<T> container;

    public BoxFruits(){
        this.container = new ArrayList<>();
    }

    public BoxFruits(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T... fruit){
        this.container.addAll(Arrays.asList(fruit));
    }

    public int getWeight(){
        if(container.size() == 0){
            return 0;
        }

        return container.size();
    }
}
