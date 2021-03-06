package de.nordakademie.blackjack;

public class Spielkarten {

	private final String farbe;
	private final String nummer;

	public Spielkarten(String farbe, String nummer)
	// muss heissen wie die Klasse aber excat; konstruktor
	{
		this.farbe = farbe;
		this.nummer = nummer;
	}

	public static final String KARO = "Karo";
	public static final String HERZ = "Herz";
	public static final String PIEK = "Piek";
	public static final String KREUZ = "Kreuz";

	public static final String ZWEI = "Zwei";
	public static final String DREI = "Drei";
	public static final String VIER = "Vier";
	public static final String FUENF = "F�nf";
	public static final String SECHS = "Sechs";
	public static final String SIEBEN = "Sieben";
	public static final String ACHT = "Acht";
	public static final String NEUN = "Neun";
	public static final String ZEHN = "Zehn";
	public static final String BUBE = "Bube";
	public static final String DAME = "Dame";
	public static final String KOENIG = "K�nig";
	public static final String ASS = "Ass";

	public static final String[] FARBEN = { HERZ, PIEK, KARO, KREUZ };

	public static final String[] NUMMERN = { ZWEI, DREI, VIER, FUENF, SECHS, SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME,
			KOENIG, ASS };
	
	
	public int kartenwert () {
		
		switch(nummer){
		case ZWEI :return 2 ;
		case DREI :return 3;
		case VIER :return 4;
		case FUENF :return 5;
		case SECHS :return 6;
		case SIEBEN :return 7;
		case ACHT :return 8;
		case NEUN :return 9;
		case ZEHN :return 10;
		case BUBE :return 10;
		case DAME :return 10;
		case KOENIG :return 10;
		case ASS : return 11;
		
		
		}
		return 0;
	}
	
	public String getNummer() 
	{ return nummer ; }
	{
		
		

	}

}
