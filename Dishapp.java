package pl.edu.pw.ii.jee.ppj;

public class Dishapp {

	public static void main(String[] args) {
		
		Dish danie = new Dish("Spaggeti", "salt", 3);
		Dish danie2 = new Dish("Spaggeti", "sugar", 3);
		SpiceType danie3 = new Dish("Kluski", "salt", 5);
		
		
		//System.out.println("W kuchni robisz  "+((Dish)danie3).getDish());
		
		
		
		System.out.println("In the kitchen you are making "+danie.getDish() +  ", to the dish were added " + danie.getSpoon() + " spoons of " + danie.getSpice());
		
		danie.salt(0); // pierwsze wywołanie salt i nadpisanie i 
		danie.sugar(3);
		danie.oregano(3);
		danie.basil(3);
		danie.basil(3);
		
		System.out.println("In the kitchen you are making "+danie2.getDish() +  ", to the dish were added " + danie2.getSpoon() + " spoons of " + danie2.getSpice());
		danie2.salt(1); 
		danie2.sugar(0);
		danie2.oregano(1);
		danie2.basil(1);
		danie2.basil(1);
		System.out.println("In the kitchen you are making "+((Dish)danie3).getDish() +  ", to the dish were added " + ((Dish)danie3).getSpoon() + " spoons of " + ((Dish)danie3).getSpice());
		danie3.basil(1);
}
}
