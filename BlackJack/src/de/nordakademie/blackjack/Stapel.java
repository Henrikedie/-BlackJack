package de.nordakademie.blackjack;

import java.util.Random;

public class Stapel {

	private final Spielkarten[] stapel = new Spielkarten[52];

	private int zeiger = 0;

	public Spielkarten gibkarte() {
		return stapel[zeiger++];
	}

	public Stapel() {
		int i = 0;
		for (String farbe : Spielkarten.FARBEN) {
			for (String nummern : Spielkarten.NUMMERN) {
				stapel[i++] = new Spielkarten(farbe, nummern);
			}
		}
		shuffle();
	}

	public void shuffle() {
		for (int i = stapel.length; i > 1; i--)
			swap(stapel, i - 1, new Random().nextInt(i));
	}

	private static void swap(Object[] arr, int i, int j) {
		Object tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
