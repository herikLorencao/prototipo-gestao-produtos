package br.com.test.gestaoprodutos.infra.database.orm;

import br.com.test.gestaoprodutos.domain.Situacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table( name = "fornecedores" )
public class FornecedorData {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id", nullable = false )
	private Long id;

	@Column( name = "descricao" )
	private String descricao;

	@Column( name = "cpnj" )
	private String cpnj;

	@Enumerated( EnumType.STRING )
	@Column( name = "situacao" )
	private Situacao situacao;

	@OneToMany( mappedBy = "fornecedor", orphanRemoval = true )
	private List<ProdutoData> produtos = new ArrayList<>();

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj( String cpnj ) {
		this.cpnj = cpnj;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public List<ProdutoData> getProdutos() {
		return produtos;
	}

	public void setProdutos( List<ProdutoData> produtos ) {
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	@Override
	public boolean equals( Object o ) {
		if( this == o )
			return true;
		if( o == null || getClass() != o.getClass() )
			return false;
		FornecedorData that = ( FornecedorData ) o;
		return Objects.equals( id, that.id ) && Objects.equals( descricao, that.descricao ) && Objects.equals( cpnj, that.cpnj ) && situacao == that.situacao && Objects.equals( produtos, that.produtos );
	}

	@Override
	public int hashCode() {
		return Objects.hash( id, descricao, cpnj, situacao, produtos );
	}
}
