package br.com.test.gestaoprodutos.infra.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.Provider;
import org.modelmapper.spring.SpringIntegration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

	@Bean
	public ModelMapper modelMapper( BeanFactory beanFactory ) {
		var modelMapper = new ModelMapper();
		Provider<?> springProvider = SpringIntegration.fromSpring( beanFactory );
		modelMapper.getConfiguration().setProvider( springProvider );
		return modelMapper;
	}
}
