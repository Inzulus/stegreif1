
public class Gemuese extends Zutat{
	
	private int scheibenAnzahl;
	private int scheibenDicke;
	
	public Gemuese(int nummer, String name, float preis, boolean klassisch) {
		this.nummer = nummer;
		this.name = name;
		this.preis = preis;
		this.klassisch = klassisch;
		this.vegan = true;
	}

	@Override
	public int zubereiten() {
		return scheibenAnzahl;
	}

	@Override
	public int berechneHoehe() {
		return scheibenDicke;
	}

}


