package br.com.test.gestaoprodutos.domain.fornecedor;

import java.util.List;

public interface FornecedorRepository {
	Fornecedor buscar(Long id);
	List<Fornecedor> listar();
	Fornecedor cadastrar( Fornecedor supplier);
	Fornecedor alterar( Fornecedor supplier);
	void remover(Long id);
}
