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
	
	public void setDeposito (double saldo) {
		 this.saldo = saldo;
	}
	public void setPrelievo (double saldo) {
		 this.saldo = saldo;
	}
	public double getContoCorrente () {
		return saldo - saldo;	}

}
