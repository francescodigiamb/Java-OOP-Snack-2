package org.lessons.java.snack;

public class Main {

	public static void main(String[] args) {
		
		ContoBancario conto = new ContoBancario(160);
		conto.setDeposito(5);
		conto.setPrelievo(2);
		System.out.println(conto.getContoCorrente());
	}

}
