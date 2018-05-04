
public class Sauce extends Zutat{
	
	private int menge;
	private String geschmack; //normal, scharf, süß
	
	public Sauce(int nummer, String name, float preis, boolean klassisch, boolean vegan, boolean vegetarisch, int menge, String geschmack) {
		super(nummer, name, preis, klassisch, vegan, vegetarisch);

		this.menge = menge;
		this.geschmack = geschmack;
		
	}

	@Override
	public int zubereiten() {
		System.out.println(name+" wird geschüttelt!");
		return 0;
	}

	@Override
	public int berechneHoehe() {
		return 0;
	}

}


