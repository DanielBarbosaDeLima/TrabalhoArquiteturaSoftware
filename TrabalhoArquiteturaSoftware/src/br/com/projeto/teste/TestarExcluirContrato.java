package br.com.projeto.teste;

import org.junit.Test;

import br.com.projeto.entity.Contrato;
import br.com.projeto.facade.ContratoFacade;

public class TestarExcluirContrato {
	@Test
	public void excluirContrato() {
		
		Contrato c = new Contrato();
		c.setId(10);
		c.setCod_pacote(2);
		c.setNome_pacote("Seg++");
		c.setDescricao("Descrição");
		c.setIndenizacao(200000);
		c.setValor_mensal(100.00);
		c.setCod_empregado(5);
		c.setNome_empregado("Vanessa");
		c.setFuncao("Babá");
		
		ContratoFacade facade = new ContratoFacade();
		facade.excluir(c);
	}
}
