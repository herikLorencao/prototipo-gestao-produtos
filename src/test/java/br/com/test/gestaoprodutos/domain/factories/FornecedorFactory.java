package br.com.test.gestaoprodutos.domain.factories;

import br.com.test.gestaoprodutos.domain.Situacao;
import br.com.test.gestaoprodutos.domain.fornecedor.CNPJ;
import br.com.test.gestaoprodutos.domain.fornecedor.Fornecedor;
import br.com.test.gestaoprodutos.domain.produto.Produto;

import java.util.ArrayList;

public class FornecedorFactory {
	public Fornecedor geraValido() {
		var cnpj = new CNPJ( "03.778.130/0001-48" );
		var produtos = new ArrayList<Produto>();
		return new Fornecedor( 1L, "Teste", cnpj, produtos, Situacao.ATIVADO );
	}
}
