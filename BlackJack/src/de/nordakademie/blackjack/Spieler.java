package de.nordakademie.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spieler {

	private Kartenhand blatt = new Kartenhand();

	public boolean karteziehen() {
		System.out.println("Du hast" + blatt.kartenWertZählen() + "Punkte. Möchtest du noch ein Karte?");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String eingabe = reader.readLine();
			if (eingabe.equalsIgnoreCase("ja")) {
				return true;
			} else{
				return false;}
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	public void karteAufnehmen( Spielkarten karte ){
		blatt.karteZiehen(karte);
	}

	public static void main(String[] args) {
		new Spieler().karteziehen();
	}
	
public int stand() {
		
		return blatt.kartenWertZählen();
	}

}
