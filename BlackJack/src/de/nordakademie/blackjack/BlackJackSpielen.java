package de.nordakademie.blackjack;

public class BlackJackSpielen {

	private Stapel stapela = new Stapel();
	private Geber bank = new Geber();
	private Spieler fred = new Spieler();

	public void spielStarten() {
		fred.karteAufnehmen(stapela.gibkarte());
		fred.karteAufnehmen(stapela.gibkarte());
		bank.karteAufnehmen(stapela.gibkarte());
		spielstand();
	}

	
	private void spielstand(){
		System.out.println("Geber:" + bank.stand());
		System.out.println("Spieler:" + fred.stand());
		

	}
	
	public static void main(String[] args) {
		new BlackJackSpielen().spielStarten();
	}
}
