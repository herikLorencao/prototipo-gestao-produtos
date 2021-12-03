package br.com.test.gestaoprodutos.domain.produto;

import br.com.test.gestaoprodutos.domain.Situacao;
import br.com.test.gestaoprodutos.domain.fornecedor.Fornecedor;

import java.time.LocalDate;

public class Produto {

	private final Long codigo;
	private final String descricao;
	private final LocalDate dataFabricacao;
	private final LocalDate dataValidade;
	private final Fornecedor fornecedor;
	private Situacao situacao;

	public Produto( Long codigo, String descricao, LocalDate dataFabricacao, LocalDate dataValidade, Fornecedor fornecedor, Situacao situacao ) {
		if (!datasFabricacaoValidadeSaoValidas( dataFabricacao, dataValidade ))
			throw new DatasInvalidas(this);

		this.codigo = codigo;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
		this.fornecedor = fornecedor;
		this.situacao = situacao;
	}

	public void desativar() {
		situacao = Situacao.DESATIVADO;
	}

	private boolean datasFabricacaoValidadeSaoValidas(LocalDate dataFabricacao, LocalDate dataValidade) {
		return dataFabricacao.isBefore( dataValidade );
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}
}
