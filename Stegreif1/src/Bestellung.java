
public class Bestellung {
	
	public static Zutat[] alleZutaten = new Zutat[53];
	public static Burger[] warenkorb = new Burger[10];
	public static int anzahlBurger = 0;
	public static int aktuellerBurger = 0;
	private static boolean quit = false;
	

	public static void main(String[] args) {

		alleZutaten[10] = new Broetchen(10, "Hamburger (Standard)", 0.85f, 27, 90, true, false, true);
		alleZutaten[11] = new Broetchen(11, "Hamburger Sesam", 0.95f, 28, 90, true, false, true);
		alleZutaten[12] = new Broetchen(12, "Vegan Brötchen", 0.55f, 34, 240, true, true, true);
		alleZutaten[13] = new Broetchen(13, "Ciabatta", 0.45f, 41, 330, true, false, true);
		
		Broetchen brot1 = (Broetchen) alleZutaten[10];
		System.out.println(brot1.toString());
		
		System.out.println("Willkommen bei In 'n Out ");
		System.out.println("Ihre Bestellung bitte");
		System.out.println("(1) Neuer Burger");
		System.out.println("(2) Zutat zu aktuellem Burger hinzufügen");
		System.out.println("(9) Bestelluing abschließen");
		
		String einlesen = StaticScanner.nextString();
		
		while(!quit) {
			
			switch(einlesen) {
			case "9":
				quit = true;
				break;
			
			case "1":
				System.out.println("Wie soll ihr neuer Burger heißen?");
				String name = StaticScanner.nextString();
				warenkorb[anzahlBurger] = new Burger(name);
				aktuellerBurger = anzahlBurger;
				anzahlBurger++;
				break;
			case "2":
				System.out.println("Welche Zutat möchten sie hinzufügen: ");
				int zutatenNummer = StaticScanner.nextInt();
				Zutat aktuelleZutat = alleZutaten[zutatenNummer];
				warenkorb[aktuellerBurger].zutatHinzufuegen(aktuelleZutat);
				
				
				
			}
			
			System.out.println("Nächste Aktion:");
			einlesen = StaticScanner.nextString();
		}
		

	}

}
