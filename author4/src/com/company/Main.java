package com.company;

public class Main {

    public static void main(String[] args) {
	    Room myRoom = new Room(); //создаем комнату
		Sofa mySofa = new Sofa(100, 4, "LEROW-SOFA", 5); //создаем диван
	    Cupboard myCupboard = new Cupboard(200, 5, "IKEA", 190, true); //создаем шкаф
		myRoom.addFur(mySofa);//добавляем диван в комнату
		myRoom.addFur(myCupboard); //добавляем шкаф в комнату

		myRoom.printCupboardRoom(); //выводим все шкафы через instanceof
		myRoom.printSofaRoom(); //выводим все диваны через instanceof

		myRoom.printRoom(); //выводим информацию о всей мебели
    }
}
