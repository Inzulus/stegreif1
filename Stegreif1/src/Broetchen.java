
public class Broetchen extends Zutat{
	
	private int backzeit;
	private int hoehe;
	
	public Broetchen(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch,int hoehe,int backzeit) {
		super(nummer, name, preis, klassisch, vegan, vegetarisch);
		
		this.hoehe = hoehe;
		this.backzeit = backzeit;
		}

	@Override
	public int zubereiten() {
		System.out.println(name+" wird "+backzeit+" Minuten aufgebacken, bzw. wird direkt verwendet ");
		return backzeit;
	}

	@Override
	public int berechneHoehe() {
		return (int) (hoehe*1.02*(backzeit/60));
	}

	
	
}
