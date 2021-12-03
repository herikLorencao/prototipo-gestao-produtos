package br.com.test.gestaoprodutos.infra.database.repositories;

import br.com.test.gestaoprodutos.infra.database.orm.ProdutoData;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDataRepository extends PagingAndSortingRepository<ProdutoData, Long> {

}
