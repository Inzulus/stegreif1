
public class Burger {
	
	private String name;
	private Zutat[] zutaten = new Zutat[8];
	private int anzahlZutaten = 0;
	private int hoehe = 0;
	private float preis = 0;
	
	


	public Burger(String name) {
		this.name = name;
	}
	
	public int gesamteZeit() {
		int zeit=0;
		for(int i = 0; i<zutaten.length;i++) {
			zeit +=zutaten[i].zubereiten();
		}
		return zeit;
	}
	
	public void zutatHinzufuegen(Zutat zutat) {
		zutaten[anzahlZutaten] = zutat;
		anzahlZutaten++;
	}
	
	public String toString() {
		return "Name: "+name+" Höhe: "+berechneHoehe()+"Preis: "+berechnePreis();
	}
	
	public int berechneHoehe() {
		int hoehe = 0;
		for(int i = 0; i < anzahlZutaten;i++) {
			hoehe += zutaten[i].berechneHoehe();
		}
		return hoehe;
	}
	
	public float berechnePreis() {
		float preis = 0;
		for(int i = 0; i < anzahlZutaten;i++) {
			preis += zutaten[i].getPreis();
		}
		return preis;
		
	}
	public String getZutaten() {
		String zutatenString = "";
		
		if(anzahlZutaten == 0) {
			return "keine Zutaten!";
		}
		
			
		for(int i = 0;i< anzahlZutaten;i++) {
			zutatenString += zutaten[i].toString();
		}
		return zutatenString;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getHoehe() {
		return hoehe;
	}
	
	public float getPreis() {
		return preis;
	}

}
