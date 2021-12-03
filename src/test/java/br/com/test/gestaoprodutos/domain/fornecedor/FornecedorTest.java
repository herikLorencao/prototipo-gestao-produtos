package br.com.test.gestaoprodutos.domain.fornecedor;

import br.com.test.gestaoprodutos.domain.Situacao;
import br.com.test.gestaoprodutos.domain.produto.Produto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FornecedorTest {
	@Test
	void deveriaDesabilitarFornecedor() {
		var cnpj = new CNPJ( "03.778.130/0001-48" );
		var produtos = new ArrayList<Produto>();
		var fornecedor = new Fornecedor( 1L, "Teste", cnpj, produtos, Situacao.ATIVADO );

		fornecedor.desabilitar();

		assertEquals( Situacao.DESATIVADO, fornecedor.getSituacao());
	}
}

