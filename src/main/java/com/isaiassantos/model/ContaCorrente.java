package com.isaiassantos.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato com.isaiassantos.model.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
