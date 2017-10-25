package br.com.projeto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrato {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer cod_pacote;
	private String nome_pacote;
	private String descricao;
	private double indenizacao;
	private double valor_mensal;
	private Integer cod_empregado;
	private String nome_empregado;
	private String funcao;
	
	public Contrato(){
		
	};
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getIndenizacao() {
		return indenizacao;
	}
	public void setIndenizacao(double indenizacao) {
		this.indenizacao = indenizacao;
	}
	public double getValor_mensal() {
		return valor_mensal;
	}
	public void setValor_mensal(double valor_mensal) {
		this.valor_mensal = valor_mensal;
	}
	public Integer getCod_pacote() {
		return cod_pacote;
	}
	public void setCod_pacote(Integer cod_pacote) {
		this.cod_pacote = cod_pacote;
	}
	public String getNome_pacote() {
		return nome_pacote;
	}
	public void setNome_pacote(String nome_pacote) {
		this.nome_pacote = nome_pacote;
	}
	public Integer getCod_empregado() {
		return cod_empregado;
	}
	public void setCod_empregado(Integer cod_empregado) {
		this.cod_empregado = cod_empregado;
	}
	public String getNome_empregado() {
		return nome_empregado;
	}
	public void setNome_empregado(String nome_empregado) {
		this.nome_empregado = nome_empregado;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}
