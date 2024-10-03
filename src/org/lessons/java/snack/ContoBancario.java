package org.lessons.java.snack;

import java.util.Random;

public class ContoBancario {
	
	private int numeroConto;
	private double saldo;
	private double deposito;
	private double prelievo;
	private double saldoCorrente;
	
	ContoBancario (int numeroConto) {
		this.numeroConto = numeroConto;
		this.saldo = 0;
	}
	
	public void setDeposito (double deposito) {
		 this.deposito = deposito;
	}
	public void setPrelievo (double prelievo) {
		 this.prelievo = prelievo;
	}
	public double getContoCorrente () {
		return saldo + (deposito - prelievo);	}

}
