
public class Bratling  extends Zutat{
	
	private int bratzeit;
	private int hoehe;
	
	public Bratling(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, int hoehe, int bratzeit ) {
		super(nummer, name, preis, klassisch, vegan, vegetarisch);
		this.bratzeit = bratzeit;
		this.hoehe = hoehe;

	}

	@Override
	public int zubereiten() {
		System.out.println(name+" wird "+bratzeit/60+" Minuten gebraten ");
		return bratzeit;
	}

	@Override
	public int berechneHoehe() {
		return (int) ((hoehe/1.035)*(bratzeit/60));
	}

}
