package src.factory;

import src.factory.cheese.CheeseType;
import src.factory.cheese.Cheese;
import src.factory.cheese.CheeseFactory;

public class Main {
	
	public static void main(String[] args) {
//		Gouda g = new Gouda();
		
		Cheese c = CheeseFactory.create(CheeseType.GOUDA);
		System.out.println("I am a "+c.getName()+" and I last until "+c.getBestBeforeDate() +"!");
	}

}
