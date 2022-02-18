package pagamento;

public class PagamentoFacade {

	public static void pagamentoBoleto(String codigoBarras, double valor) {
		Adyen adyen = new Adyen();
		adyen.transacaoBoleto(0, valor);

	}

	public static void pagamentoPix(String chave, double valor) {
		NuBank nubank = new NuBank();
		nubank.transacaoPix("", valor);
	}

	public static void pagamentoCartao(int numeroCartao, int codigo, double valor) {

		if (valor < 2000) {
			PagSeguro pagseguro = new PagSeguro();
			pagseguro.transacaoCartao(numeroCartao, valor);
		} else {
			PayPal paypal = new PayPal();
			paypal.transacaoCartao(numeroCartao, valor);
		}
	}

}
