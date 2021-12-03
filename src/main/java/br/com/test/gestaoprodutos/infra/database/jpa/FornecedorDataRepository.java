package br.com.test.gestaoprodutos.infra.database.jpa;

import br.com.test.gestaoprodutos.infra.database.orm.FornecedorData;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorDataRepository extends PagingAndSortingRepository<FornecedorData, Long> {

}
