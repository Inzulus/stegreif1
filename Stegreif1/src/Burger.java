public class Burger {

	private String name;
	private Zutat[] zutaten = new Zutat[8];
	private int anzahlZutaten = 0;
	private int hoehe = 0;
	private float preis = 0;
	private boolean klassisch = true;
	private boolean vegan = true;
	private boolean vegetarisch = true;
	int gesamteZeit = 0;

	public Burger(String name) {
		this.name = name;
	}

	public int gesamteZeit() {
		int zeit = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			zeit += zutaten[i].zubereiten();
		}
		return zeit;
	}

	public void zutatHinzufuegen(Zutat zutat) {
		zutaten[anzahlZutaten] = zutat;
		anzahlZutaten++;
	}

	public String toString() {
		gesamteZeit = gesamteZeit();
		
		return "\nName: " + name + "  Höhe: " + berechneHoehe() + " mm" + "  Preis: " + berechnePreis() + " €"
				+ "  Zubereitungszeit: " + gesamteZeit + " Sekunden" +"  "+ bestimmeZustand();
	}

	public String bestimmeZustand() {
		String zustand = "";
		for (int i = 0; i < anzahlZutaten; i++) {
			if (!zutaten[i].isKlassisch()) {
				klassisch = false;
			}
			if (!zutaten[i].isVegetarisch()) {
				vegetarisch = false;
			}

			if (!zutaten[i].isVegan()) {
				vegan = false;
			}
		}

		if (klassisch) {
			zustand += "Klassisch ";
		}

		if (vegetarisch) {
			zustand += "Vegetarisch ";
		}

		if (vegan) {
			zustand += "Vegan ";
		}

		return zustand;

	}

	public int berechneHoehe() {
		int hoehe = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			hoehe += zutaten[i].berechneHoehe();
		}
		return hoehe;
	}

	public float berechnePreis() {
		float preis = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			preis += zutaten[i].getPreis();
		}
		return preis;

	}
	
	public int getGesamteZeit() {
		 return gesamteZeit;
	}

	public String getZutaten() {
		String zutatenString = "";

		if (anzahlZutaten == 0) {
			return "keine Zutaten!";
		}

		for (int i = 0; i < anzahlZutaten; i++) {
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

	public int getAnzahlZutaten() {
		return anzahlZutaten;
	}

}
