
public class Burger {
	
	private String name;
	private Zutat[] zutaten = new Zutat[8];
	private int anzahlZutaten = 0;
	private int hoehe = 0;
	private float preis = 0;
	
	


	public Burger(String name) {
		this.name = name;
	}
	
	public void zutatHinzufuegen(Zutat zutat) {
		zutaten[anzahlZutaten] = zutat;
		anzahlZutaten++;
	}
	
	
	public void berechneHoehe() {
		for(int i = 0; i < anzahlZutaten;i++) {
			hoehe += zutaten[i].berechneHoehe();
		}
	}
	
	public void berechnePreis() {
		for(int i = 0; i < anzahlZutaten;i++) {
			preis += zutaten[i].getPreis();
		}
		
	}
	
	
	public int getHoehe() {
		return hoehe;
	}
	
	public float getPreis() {
		return preis;
	}

}
