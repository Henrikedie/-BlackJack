package de.nordakademie.blackjack;

public class Geber {

	private Kartenhand blatt = new Kartenhand();

	public boolean karteziehen(Spielkarten karte) {
		if (blatt.kartenWertZ�hlen() > 17) {
			return true;
		} else {
			return false;
		}
	}

	public void karteAufnehmen(Spielkarten karte) {
		blatt.karteZiehen(karte);

	}

	public int stand() {
		
		return blatt.kartenWertZ�hlen();
	}
}
