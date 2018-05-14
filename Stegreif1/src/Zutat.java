
/**
 * @author Julius Mueller & Lidiaa 
 *
 */
public abstract class Zutat {
	
	protected int nummer;
	protected  String name;
	protected  float preis;
	protected  boolean klassisch;


	protected  boolean vegan;
	protected  boolean vegetarisch;
	
	public Zutat(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.klassisch =klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
	}
	
	
	/*public Zutat() {
		
	}*/
	
	public abstract int zubereiten();
	
	public abstract int berechneHoehe(); 
	
	/** 
	 * @return gibt einen String mit den Eckdaten der Zutat zurück
	 */
	public String toString() {
		String nummerNamePreis;
		nummerNamePreis = "Nummer: "+nummer+" Name: "+name+" Preis: "+preis+" Klassisch: "+
				klassisch+" Vegan: "+vegan+" Vegetarisch: "+vegetarisch+"\n";
		return nummerNamePreis;
		
	}
	
	public boolean isKlassisch() {
		return klassisch;
	}


	public boolean isVegan() {
		return vegan;
	}


	public boolean isVegetarisch() {
		return vegetarisch;
	}
	
	public float getPreis() {
		return preis;
	}

}
