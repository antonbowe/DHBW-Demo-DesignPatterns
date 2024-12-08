package java.decorator;

import java.decorator.coffee.ChocoSirupDecorator;
import java.decorator.coffee.Coffee;
import java.decorator.coffee.MilkDecorator;
import java.decorator.coffee.MintSirupDecorator;
import java.decorator.coffee.SimpleCoffee;
import java.decorator.coffee.VanillaSirupDecorator;

public class Main {
	
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new MilkDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new VanillaSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new ChocoSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new MintSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
	}

}
