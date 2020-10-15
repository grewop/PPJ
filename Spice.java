package pl.edu.pw.ii.jee.ppj;

public abstract class Spice {		//wpisanie nazwy przyprawy

	protected String spice;
	protected int spoon;	
	protected String dish;
	
	public String getSpice() {
		
		return this.spice ;
	}
	public int getSpoon() {
		return spoon;
	}
	public String getDish() {
		return dish;
	}
	protected abstract void setSpice(String spice) ;
	protected abstract void setSpoon(int spoon);
	protected abstract void setDish(String dish);
}
