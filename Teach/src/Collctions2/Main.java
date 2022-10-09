package Collctions2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "Пиво",
                "Дом",
                "Дерево",
                "Машина",
                "Дом",
                "Дерево",
                "Москва",
                "Компик",
                "Я",
                "Дерево",
                "Стол",
                "Стул",
                "Дом",
        };

        HashMap<String, Integer> mapString = new HashMap<>();

        for(String s : words){
            if(!mapString.containsKey(s)){
                mapString.put(s, 1);
            }else{
                mapString.put(s, mapString.get(s)+1);
            }
        }

        for(Map.Entry<String, Integer> entry : mapString.entrySet()){
            System.out.println(entry.getKey());
        }


    }
}
