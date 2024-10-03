package org.lessons.java.snack;

public class ContoBancario {
    private String numeroConto;
    private double saldo;

    // Costruttore che accetta il numero di conto e inizializza il saldo a zero
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    // Metodo per depositare denaro sul conto
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato.");
        } else {
            System.out.println("L'importo del deposito deve essere positivo.");
        }
    }

    // Metodo per prelevare denaro dal conto
    public void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato.");
        } else if (importo > saldo) {
            System.out.println("Saldo insufficiente per effettuare il prelievo.");
        } 
    }

    // Metodo per ottenere il saldo corrente
    public double getSaldo() {
        return saldo;
    }

    // Metodo per ottenere il numero di conto
    public String getNumeroConto() {
        return numeroConto;
    }
}
