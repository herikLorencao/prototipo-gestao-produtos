package br.com.test.gestaoprodutos.domain.fornecedor;

public class CNPJ {
	private final String valor;

	public CNPJ( String value ) {
		this.valor = value;
	}

	public String getValor() {
		return valor;
	}
}
