
/**
 * @author Julius Mueller & Lidiaa 
 *
 */
public class Broetchen extends Zutat{
	
	private int backzeit;
	private int hoehe;
	
	public Broetchen(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch,int backzeit,int hoehe) {
		super(nummer, name, preis, klassisch, vegan, vegetarisch);
		
		this.hoehe = hoehe;
		this.backzeit = backzeit;
		}

	/* (non-Javadoc)
	 * @see Zutat#zubereiten()
	 */
	@Override
	public int zubereiten() {
		System.out.println(name+" wird "+backzeit+" Sekunden aufgebacken, bzw. wird direkt verwendet ");
		return backzeit;
	}
	
	/**
	 *@return Gibt die Höhe zurück und berechnet die Höhe je nach Backzeit
	 */
	@Override
	public int berechneHoehe() {
		return (int) (hoehe*1.02*(backzeit/60));
	}

	
	
}
