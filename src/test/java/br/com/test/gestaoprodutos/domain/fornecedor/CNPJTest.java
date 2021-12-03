package br.com.test.gestaoprodutos.domain.fornecedor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

class CNPJTest {
	@Test
	void deveriaCadastrarCNPJ() {
		assertAll( () -> new CNPJ( "03.778.130/0001-48" ) );
	}
}
