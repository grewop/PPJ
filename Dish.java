package pl.edu.pw.ii.jee.ppj;

public class Dish extends Spice implements SpiceType {
	int NumberOfSpoons = 0;
	int NumberOfSpoonsu = 0;
	int NumberOfSpoono = 0;
	int NumberOfSpoonb = 0;
	int i = 0;
	public Dish(String dish, String spice, int Spoon) {
		setDish(dish);
		setSpice(spice);
		setSpoon(Spoon);
	}

	@Override
	public void setDish(String dish) {
		this.dish = dish;

	}

	// Dawkowanie przypraw i co to oznacza
	@Override
	public void salt(int sSpoon) {

		if (getSpice().equals("salt") && i == 0) {
			i = 1; // potwierdzenie ze juz raz dodano główna klase , teraz dodaje sie tylko przyprawy
			NumberOfSpoons += getSpoon();
			
			System.out.println(" ");
			System.out.println("To " + getDish() + " was added " + getSpoon() + " spoons of salt");
			if (NumberOfSpoons > 2) {
				System.out.print("You added too much salt");
			}
		} else if (sSpoon != 0) {

			NumberOfSpoons += sSpoon;
			System.out.println(" ");
			System.out.println("To " + getDish() + " was added " + NumberOfSpoons + " spoons of salt");
			if (NumberOfSpoons > 2) {
				
				System.out.print("You added too much salt");
			}

		}
	}

	@Override
	public void sugar(int suSpoon) {

		if (getSpice().equals("sugar") && i == 0) {
			i = 1;
			
			NumberOfSpoonsu += getSpoon();
			System.out.println(" ");
			System.out.println("To " + getDish() + " was added " + getSpoon() + " spoons of sugar");
			if (NumberOfSpoonsu > 2) {
				System.out.print("You added too much sugar");
			}
		} else if (suSpoon != 0) {

			NumberOfSpoonsu += suSpoon;
			System.out.println(" ");
			System.out.println("To " + getDish() + " was added " + NumberOfSpoonsu + " spoons of sugar");
			if (NumberOfSpoonsu > 2) {
				System.out.print("You added too much sugar");
			}

		}
	}

	@Override
	public void oregano(int oSpoon) {
		if (getSpice().equals("oregano") && i == 0) {
			i = 1;
			
			NumberOfSpoono += getSpoon();
			
			System.out.println(" ");
			
			System.out.println("To " + getDish() + " was added " + getSpoon() + " spoons of oregano");
			if (NumberOfSpoono > 2) {
				System.out.print("You added too much oregano");
				System.out.println(" ");
			}
		}else if (oSpoon != 0) {

				NumberOfSpoono += oSpoon;
				System.out.println(" ");
				System.out.println("To " + getDish() + " was added " + NumberOfSpoono + " spoons of oregano");
				if (NumberOfSpoono > 3) {
					System.out.print("You added too much oregano");
					System.out.println(" ");
				}

			}
		

	}

	@Override
	public void basil(int bSpoon) {
		if (getSpice().equals("basil") && i == 0) {
			i = 1;
			
			NumberOfSpoonb += getSpoon();
			
			System.out.println(" ");
			
			
			System.out.println("To " + getDish() + " was added " + getSpoon() + " spoons of basil");
			if (NumberOfSpoonb > 2) {
				System.out.print("You added too much basil");
				System.out.println(" ");
			}
		
		}else if (bSpoon != 0) {

			NumberOfSpoonb += bSpoon;
			System.out.println(" ");
			System.out.println("To " + getDish() + " was added " + NumberOfSpoonb + " spoons of basil");
			if (NumberOfSpoonb > 3) {
				System.out.print("You added too much basil");
				System.out.println(" ");
			}

		}

	}

	@Override
	public void setSpice(String spice) {
		this.spice = spice;

	}

	@Override
	public void setSpoon(int spoon) {
		this.spoon = spoon;

	}

}
