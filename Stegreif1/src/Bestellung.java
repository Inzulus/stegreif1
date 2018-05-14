
public class Bestellung {
	
	public static Zutat[] alleZutaten = new Zutat[54];
	public static Burger[] warenkorb = new Burger[10];
	public static int anzahlBurger = 0;
	public static int aktuellerBurger = 0;
	private static boolean quit = false;
	private static boolean hatBroetchen = false;
	

	public static void main(String[] args) {

		alleZutaten[10] = new Broetchen(10, "Hamburger (Standard)", 0.85f, true, false, true,27,90);
		alleZutaten[11] = new Broetchen(11, "Hamburger Sesam", 0.95f, true, false, true, 28, 90);
		alleZutaten[12] = new Broetchen(12, "Vegan Brötchen", 0.55f, true, true, true, 34, 240);
		alleZutaten[13] = new Broetchen(13, "Ciabatta", 0.45f, true, false, true, 41, 330);
		
		alleZutaten[20] = new Bratling(20,"Rindfleisch (Original)", 1.85f, true, false,false,25,270);
		alleZutaten[21] = new Bratling(21,"Hähnchenfleisch (gegrillt)", 1.15f, false, false,false,11,180);
		alleZutaten[22] = new Bratling(22,"Falafel Bratling", 1.45f, false, true,true,21,210);
		alleZutaten[23] = new Bratling(23,"Gemüse Bratling", 1.75f, false, true,true,25,240);
		
		alleZutaten[30] = new Salat(30,"Eisbergsalat",0.18f,false,true,true);
		alleZutaten[31] = new Salat(31,"Rucola",0.25f,false,true,true);
		
		alleZutaten[40] = new Gemuese(40,"Tomate",0.25f,true,true,true,3,3);
		alleZutaten[41] = new Gemuese(41,"Gurke",0.15f,true,true,true,4,2);
		alleZutaten[42] = new Gemuese(42,"Rote Zwiebelringe",0.08f,false,true,true,5,2);
		alleZutaten[43] = new Gemuese(43,"Jalapeno",0.08f,false,true,true,5,2);
		
		alleZutaten[50] = new Sauce(50,"Ketchup",0.10f,true,true,true,5,"normal");
		alleZutaten[51] = new Sauce(51,"Sandwichsauce",0.15f,true,false,true,10,"normal");
		alleZutaten[52] = new Sauce(52,"Chillisauce",0.25f,false,true,true,8,"scharf");
		alleZutaten[53] = new Sauce(53,"Honig-Senf-Sauce",0.18f,false,false,true,8,"süß");
		
		
		
		
		//Broetchen brot1 = (Broetchen) alleZutaten[10];
		//System.out.println(brot1.toString());
		menueAusgabe(alleZutaten);
		System.out.println("");
		System.out.println("Willkommen bei In 'n Out ");
		System.out.println("Ihre Bestellung bitte");
		System.out.println("(0) Menü ausgeben");
		System.out.println("(1) Neuer Burger");
		System.out.println("(2) Zutat zu aktuellem Burger hinzufügen");
		System.out.println("(3) aktuelle Burger ausgeben");
		System.out.println("(9) Bestellung abschließen");
		String einlesen = StaticScanner.nextString();
		
		while(!quit) {
			
			switch(einlesen) {
			case "9":
				quit = true;
				burgerAusgabe(warenkorb);
				break;
				
			case "0":
				menueAusgabe(alleZutaten);
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
				if(alleZutaten[zutatenNummer] != null) {
					
				Zutat aktuelleZutat = alleZutaten[zutatenNummer];
				if(!(aktuelleZutat instanceof Broetchen) || aktuelleZutat instanceof Broetchen && hatBroetchen == false) {
				
					warenkorb[aktuellerBurger].zutatHinzufuegen(aktuelleZutat);
					System.out.println("Sie haben folgende Zutat hinzugefügt: ");
					System.out.println(aktuelleZutat.toString());
					
					if(aktuelleZutat instanceof Broetchen) {
						hatBroetchen = true;
					}

					break;	
				}
					System.out.println("Jeder Burger kann nur ein Brötchen besitzen!!!");
					break;
				}
				break;
			case "3":
				System.out.println("Name des Burgers: "+warenkorb[aktuellerBurger].getName());
				System.out.println("Alle Zutaten: ");
				System.out.println(warenkorb[aktuellerBurger].getZutaten());
				break;
				
				
			}
			if(!quit) {
			System.out.println("\nNächste Aktion:");
			einlesen = StaticScanner.nextString();
			}
			
		}
		
		

	}
	
	public static void burgerAusgabe(Burger[] warenkorb) {
		float preis=0;
		int zeit = 0;
		for(int i = 0; i<anzahlBurger;i++) {
			System.out.println(warenkorb[i].toString());
			preis +=warenkorb[i].berechnePreis();
			zeit +=warenkorb[i].getGesamteZeit();
		}

		System.out.println("\nGesamtpreis: "+preis+" €"+"  Gesamte Zeit: "+zeit+" Sekunden");
		
	}

	public static void menueAusgabe(Zutat[] alleZutaten){
		for(int i = 0;i<alleZutaten.length;i++) {
			if(i%10 == 0) {
				System.out.println("");
			}
			if(alleZutaten[i]!=null) {
				System.out.print(alleZutaten[i].toString());
			}
		}
	}

}
