/**
 * @author Julius Mueller & Lidiaa 
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
	private static boolean hatBroetchen = false;

	public Burger(String name) {
		this.name = name;
	}

	/**
	 * @return Die Zubereitungszeit aller Zutaten des Burgers
	 */
	public void zubereiten() {
		int zeit = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			zeit += zutaten[i].zubereiten();
		}
		gesamteZeit =zeit;
	}

	/**
	 * @param zutat �berpr�ft ob der Burger schon ein Br�tchen hat und f�gt die Zutaten ansonsten hinzu
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
			System.out.println("Dieser Burger besitzt schon ein Br�tchen!!!");
			
		}
	}

	/**
	 * @return Gibt die Daten des Burgers aus inklusive gesamterZeit
	 */
	public String toString() {
		//gesamteZeit = zubereiten();
		
		return "\nName: " + name + "  H�he: " + berechneHoehe() + " mm" + "  Preis: " + berechnePreis() + " �"
				+ "  Zubereitungszeit: " + gesamteZeit + " Sekunden" +"  "+ bestimmeZustand();
	}

	/**
	 * @return Gibt zur�ck ob der Burger klassisch, vegetarisch oder vegan ist
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
	 * @return berechnet die H�he aller zutaten und addiert sie
	 */
	public int berechneHoehe() {
		int hoehe = 0;
		for (int i = 0; i < anzahlZutaten; i++) {
			hoehe += zutaten[i].berechneHoehe();
		}
		return hoehe;
	}

	/**
	 * @return gibt den gesamten Preis des Burgers zur�ck
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
	 * @return gibt alle Zutaten des aktuellen Burgers zur�ck
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
