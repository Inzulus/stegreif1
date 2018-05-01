
public class Bratling  extends Zutat{
	
	private int bratzeit;
	private int hoehe;
	
	public Bratling(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegan = vegan;
		this.vegetarisch = vegetarisch;
	}

	@Override
	public int zubereiten() {
		return bratzeit;
	}

	@Override
	public int berechneHoehe() {
		return hoehe;
	}

}
