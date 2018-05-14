
/**
 * @author Julius Mueller & Lidiaa 
 *
 */
public class Salat extends Zutat{
	
	
	public Salat(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch) {
		super(nummer, name, preis, klassisch, vegan, vegetarisch);
		
	}

	@Override
	public int zubereiten() {
		System.out.println(name+" wird gewaschen");
		return 0;
	}

	@Override
	public int berechneHoehe() {
		return 0;
	}

}

