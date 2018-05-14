
/**
 * @author Julius Mueller & Lidiaa 
 *
 */
public class Gemuese extends Zutat{
	
	private int scheibenAnzahl;
	private int scheibenDicke;
	
	public Gemuese(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, 
					int scheibenAnzahl, int scheibenDicke) {
		super(nummer, name, preis, klassisch, vegan, vegetarisch);
		this.scheibenAnzahl = scheibenAnzahl;
		this.scheibenDicke = scheibenDicke;
	}

	@Override
	public int zubereiten() {
		System.out.println(name+" wird gewaschen");
		System.out.println(scheibenAnzahl+" Scheibe/Scheiben wird/werden in der Dicke von "+scheibenDicke+" mm geschnitten ");
		return scheibenAnzahl;//Dauer in Sekunden, da 1 Sekunde/Scheibe
	}

	@Override
	public int berechneHoehe() {
		return scheibenDicke;
	}

}


