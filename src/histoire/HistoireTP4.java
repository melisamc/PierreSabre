package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Commercant;


public class HistoireTP4 {

	public static void main(String[] args) {
		System.out.println("Test de la classe Humain");
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println();
		
		System.out.println("Test de la classe Commerçant");
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println();
		
		System.out.println("Test de la classe Yakuza");
		Yakuza yakulenoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakulenoir.direBonjour();
		yakulenoir.extorquer(marco);
		
		System.out.println();
		
		System.out.println("Test de la classe Ronin");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
		System.out.println();
		
		System.out.println("Test du duel");
		roro.provoquer(yakulenoir);
	}

}
