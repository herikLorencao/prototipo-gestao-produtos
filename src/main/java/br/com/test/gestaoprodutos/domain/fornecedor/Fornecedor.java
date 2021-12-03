package br.com.test.gestaoprodutos.domain.fornecedor;

public class Fornecedor {

	private final Long codigo;
	private final String descricao;
	private final CNPJ cnpj;

	public Fornecedor( Long id, String description, CNPJ cnpj ) {
		this.codigo = id;
		this.descricao = description;
		this.cnpj = cnpj;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public CNPJ getCnpj() {
		return cnpj;
	}
}
