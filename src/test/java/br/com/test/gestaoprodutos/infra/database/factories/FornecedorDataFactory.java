package br.com.test.gestaoprodutos.infra.database.factories;

import br.com.test.gestaoprodutos.domain.Situacao;
import br.com.test.gestaoprodutos.infra.database.orm.FornecedorData;
import br.com.test.gestaoprodutos.infra.database.orm.ProdutoData;

import java.util.ArrayList;

public class FornecedorDataFactory {

	public FornecedorData geraValido() {
		var produtos = new ArrayList<ProdutoData>();
		return new FornecedorData( 1L, "Vidro", "03.778.130/0001-48", Situacao.ATIVADO, produtos );
	}
}
