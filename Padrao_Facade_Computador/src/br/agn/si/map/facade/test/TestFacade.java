package br.agn.si.map.facade.test;

import br.agn.si.map.facade.PowerComputer;

public class TestFacade {

	public static void main(String[] args) {
		PowerComputer pc = new PowerComputer();
		pc.inicializarCpu();
		pc.lerdHd();
		pc.carregarMemoria();
		pc.executarCpu();
		pc.liberarMemoria();

	}

}
