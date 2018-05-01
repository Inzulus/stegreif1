
public class Sauce extends Zutat{
	
	private int menge;
	private String geschmack; //normal, scharf, süß
	
	public Sauce(int nummer, String name, float preis, int menge, String geschmack, boolean klassisch, boolean vegan, boolean vegetarisch) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.menge = menge;
		this.geschmack = geschmack;
		this.klassisch = klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
	}

	@Override
	public int zubereiten() {
		return 0;
	}

	@Override
	public int berechneHoehe() {
		return 0;
	}

}


