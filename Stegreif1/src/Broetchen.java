
public class Broetchen extends Zutat{
	
	private int backzeit;
	private int hoehe;
	
	public Broetchen(int nummer, String name, float preis,int hoehe,int backzeit, boolean klassisch, boolean vegan, boolean vegetarisch) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.hoehe = hoehe;
		this.backzeit = backzeit;
		this.klassisch = klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
	}

	@Override
	public int zubereiten() {
		return backzeit;
	}

	@Override
	public int berechneHoehe() {
		return hoehe;
	}

	
	
}
