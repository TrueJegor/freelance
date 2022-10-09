package com.company;

public class Main {

    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar(); //создаем новый гараж
        Car myCar1=new Car("Ford", 200,"Mustang",2,false); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж
        myGarage.addCar(new Car("LADA", 140, "Kalina", 4, false));//добавляем еще одну машину
        Truck myTruck=new Truck("Dove",160,"DTS",700,true);//создаем грузовик
        myGarage.addCar(myTruck); //добавляем его в гараж
        myGarage.printGarage(); //выводи на экран содержимое гаража
        myGarage.deleteCar(myTruck); //удаляем из гаража машину Dove
        myGarage.printGarage(); //выводим содержимое гаража на экран
        myGarage.deleteCar(myCar1); //удаляем из гаража машину Ford
        myGarage.printGarage(); //выводим содержимое гаража на экран
        if (myGarage.findCar(myCar1)) { //ищем машину
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

    }
}
