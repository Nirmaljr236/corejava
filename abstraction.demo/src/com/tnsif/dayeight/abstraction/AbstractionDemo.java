package com.tnsif.dayeight.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle rl = new Rectangle();
		sq.calArea();
		sq.show();
		rl.calArea();
		rl.show();
		
		System.out.println("---------------------------------------------");
		
		Shape shape;
		shape = new Square(12.f);

	} 

}
