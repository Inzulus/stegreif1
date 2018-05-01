
public class Salat extends Zutat{
	
	
	public Salat(int nummer, String name, float preis, boolean klassisch) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegan = true;
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

