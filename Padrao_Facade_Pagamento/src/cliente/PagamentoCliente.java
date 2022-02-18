package cliente;

import pagamento.PagamentoFacade;

public class PagamentoCliente {

	public static void main(String[] args) {
		
		PagamentoFacade facade = new PagamentoFacade();
		facade.pagamentoCartao(123456789, 000, 2500);
	}

}
