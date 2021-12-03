package br.com.test.gestaoprodutos.infra.configuration;

import br.com.test.gestaoprodutos.infra.database.jpa.ProdutoDataRepository;
import br.com.test.gestaoprodutos.infra.database.repositories.ProdutoDatabaseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	ProdutoDatabaseRepository produtoDatabaseRepository( ProdutoDataRepository repository, ModelMapper modelMapper) {
		return new ProdutoDatabaseRepository( repository, modelMapper);
	}
}
