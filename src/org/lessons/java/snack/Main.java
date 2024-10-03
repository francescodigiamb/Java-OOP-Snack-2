package org.lessons.java.snack;

public class Main {

	public static void main(String[] args) {
		
		ContoBancario conto = new ContoBancario(160);
		conto.setDeposito(1400);
		conto.setPrelievo(250);
		System.out.println("Il tuo conto corrente è di " + conto.getContoCorrente() + " €");
	}

}
