package com.isaiassantos;

import com.isaiassantos.model.Cliente;
import com.isaiassantos.model.Conta;
import com.isaiassantos.model.ContaCorrente;
import com.isaiassantos.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
