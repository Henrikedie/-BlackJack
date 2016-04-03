package de.nordakademie.blackjack;

public class Kartenhand {

	private Spielkarten[] kartenhand = new Spielkarten[21];
	private int zeiger = 0;

	public void karteZiehen(Spielkarten Handkarte) {

		kartenhand[zeiger] = Handkarte;
		zeiger++;

	}

	public int kartenWertZählen() {
		int punktestand = 0;
		int asszähler = 0;

		for (Spielkarten kartenwert : kartenhand) {
			if (kartenwert != null)
			{
			if (kartenwert.getNummer().equals(Spielkarten.ASS))
				asszähler++;

			punktestand = punktestand + kartenwert.kartenwert(); // addieren von

		}}
		if (punktestand > 21 && asszähler > 0)
			punktestand = punktestand - 10;
		if (punktestand > 21 && asszähler > 1)
			punktestand = punktestand - 10;
		if (punktestand > 21 && asszähler > 2)
			punktestand = punktestand - 10;
		if (punktestand > 21 && asszähler > 3)
			punktestand = punktestand - 10;

		return punktestand;

	}
}
