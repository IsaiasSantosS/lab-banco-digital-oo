package com.isaiassantos;

import com.isaiassantos.enums.TipoDocumento;
import com.isaiassantos.model.Cliente;
import com.isaiassantos.model.Conta;
import com.isaiassantos.model.ContaCorrente;
import com.isaiassantos.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		cl1.setNome("Santos");
        cl1.setDocumento("87546");
        cl1.setTipoDocumento(TipoDocumento.CFP);

        Cliente cl2 = new Cliente();
        cl2.setNome("Sousa");
        cl2.setDocumento("87546654");
        cl2.setTipoDocumento(TipoDocumento.CNPJ);
		
		Conta cc = new ContaCorrente(cl1);
		Conta poupanca = new ContaPoupanca(cl1);

        Conta cc2 = new ContaCorrente(cl2);
        Conta poupanca2 = new ContaPoupanca(cl2);

		cc.depositar(200);
        cc2.depositar(300);

        try {
            cc.transferir(100, poupanca);
            cc2.transferir(100, poupanca2);
            cc2.transferir(100, poupanca);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();
	}

}
