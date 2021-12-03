package br.com.test.gestaoprodutos.domain.produto;

import java.util.List;

public interface ProdutoRepository {
	Produto buscar(Long codigo);
	List<Produto> listarAtivos();
	Produto cadastrar( Produto produto);
	Produto alterar( Produto produto);
	void remover(Long codigo);
}
