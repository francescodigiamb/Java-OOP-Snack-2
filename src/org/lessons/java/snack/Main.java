package org.lessons.java.snack;

public class Main {

	public static void main(String[] args) {
		
        ContoBancario conto = new ContoBancario("123456789");

        // Deposito di denaro
        conto.deposita(1500);
        System.out.println("Saldo corrente: " + conto.getSaldo());

        // Prelievo di denaro
        conto.preleva(250);
        System.out.println("Saldo corrente: " + conto.getSaldo());

        // Tentativo di prelievo con saldo insufficiente
        conto.preleva(1400);
        System.out.println("Saldo corrente: " + conto.getSaldo());
    }
}
