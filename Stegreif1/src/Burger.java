/**
 * In dieser Klasse sind die Burger mit ihren Eckdaten defeniert
 * @author Julius Mueller and Lidiia Ananchenko
 *
 */
public class Burger {

	private String name;
	private Zutat[] zutaten = new Zutat[8];
	private int anzahlZutaten = 0;
	private int hoehe = 0;
	private float preis = 0;
	private boolean klassisch = true;
	private boolean vegan = true;
	private boolean vegetarisch = true;
	private int gesamteZeit = 0;
	private boolean hatBroetchen = false;

	public Burger(String name) {
		this.name = name;
	}

	/**
	 * Bereitet alle Burger zu und berechnet die Gesamt Zeit
	 */
	public void zubereiten() {
		int zeit = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			zeit += zutaten[i].zubereiten();
		}
		gesamteZeit =zeit;
	}

	/**
	 * Überprüft ob der Burger schon ein Brötchen hat und fügt die Zutaten ansonsten hinzu
	 * @param zutat Die Zutat die hinzugefügt wird
	 */
	public void zutatHinzufuegen(Zutat zutat) {
		if(!(zutat instanceof Broetchen) ||zutat instanceof Broetchen && !hatBroetchen)
		{
			zutaten[anzahlZutaten] = zutat;
			anzahlZutaten++;
			if(zutat instanceof Broetchen)
				hatBroetchen = true;
			
		}
		else {
			System.out.println("Dieser Burger besitzt schon ein Brötchen!!!");
			
		}
	}

	/**Gibt die Daten des Burgers aus inklusive gesamterZeit
	 * @return den String des Burgers
	 */
	public String toString() {
		//gesamteZeit = zubereiten();
		
		return "\nName: " + name + "  Höhe: " + berechneHoehe() + " mm" + "  Preis: " + berechnePreis() + " €"
				+ "  Zubereitungszeit: " + gesamteZeit + " Sekunden" +"  "+ bestimmeZustand()+
				"\n----------------------------------------------------------------------------"+"\n";
	}

	/**Bestimmt ofb der Bruger vegetarisch, vegan oder klasssisch ist
	 * @return Gibt zurück ob der Burger klassisch, vegetarisch oder vegan ist
	 */
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

	/**
	 * Berechnet die Höhe des Burgers
	 * @return berechnet die Höhe aller zutaten und addiert sie
	 */
	public int berechneHoehe() {
		int hoehe = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			hoehe += zutaten[i].berechneHoehe();
		}
		return hoehe;
	}

	/**
	 * @return gibt den gesamten Preis des Burgers zurück
	 */
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

	/**
	 * @return gibt alle Zutaten des aktuellen Burgers zurück
	 */
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
