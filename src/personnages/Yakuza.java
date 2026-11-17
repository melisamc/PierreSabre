package personnages;

public class Yakuza extends Humain {

	public Yakuza(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(" " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler(" J'ai piqué les " + argentVole + " sous de " + victime 
				+ ", ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
	}
}
