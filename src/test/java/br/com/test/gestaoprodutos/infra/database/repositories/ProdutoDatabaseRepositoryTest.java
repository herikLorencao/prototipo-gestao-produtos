package br.com.test.gestaoprodutos.infra.database.repositories;

import br.com.test.gestaoprodutos.infra.database.factories.ProdutoDataFactory;
import br.com.test.gestaoprodutos.infra.database.jpa.ProdutoDataRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.mockito.Mockito.when;

class ProdutoDatabaseRepositoryTest {

	@Mock
	private ProdutoDataRepository produtoDataRepository;

	@Autowired
	private ModelMapper modelMapper;

	private ProdutoDataFactory produtoDataFactory;
	private ProdutoDatabaseRepository repository;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks( this );
		produtoDataFactory = new ProdutoDataFactory();
		repository = new ProdutoDatabaseRepository( produtoDataRepository, modelMapper );
	}

//	@Test
//	void deveriaBuscarProduto() {
//		var produtoData = produtoDataFactory.geraValido();
//		when( produtoDataRepository.findById( 1L ) ).thenReturn( Optional.of( produtoData ) );
//
//		var produto = repository.buscar( 1L );
//		assertEquals( produtoData,  );
//	}
}
