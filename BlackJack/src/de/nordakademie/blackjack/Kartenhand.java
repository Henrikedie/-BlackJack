package de.nordakademie.blackjack;

public class Kartenhand {

	private Spielkarten[] kartenhand = new Spielkarten[21];
	private int zeiger = 0;

	public void karteZiehen(Spielkarten Handkarte) {

		kartenhand[zeiger] = Handkarte;
		zeiger++;

	}

	public int kartenWertZ�hlen() {
		int punktestand = 0;
		int assz�hler = 0;

		for (Spielkarten kartenwert : kartenhand) {
			if (kartenwert != null)
			{
			if (kartenwert.getNummer().equals(Spielkarten.ASS))
				assz�hler++;

			punktestand = punktestand + kartenwert.kartenwert(); // addieren von

		}}
		if (punktestand > 21 && assz�hler > 0)
			punktestand = punktestand - 10;
		if (punktestand > 21 && assz�hler > 1)
			punktestand = punktestand - 10;
		if (punktestand > 21 && assz�hler > 2)
			punktestand = punktestand - 10;
		if (punktestand > 21 && assz�hler > 3)
			punktestand = punktestand - 10;

		return punktestand;

	}
}
