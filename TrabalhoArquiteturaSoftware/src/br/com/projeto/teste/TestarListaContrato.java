package br.com.projeto.teste;

import java.util.List;

import org.junit.Test;

import br.com.projeto.entity.Contrato;
import br.com.projeto.facade.ContratoFacade;

public class TestarListaContrato {
	@Test
	public void listarContrato() {
		
		ContratoFacade facade = new ContratoFacade();
		List<Contrato> contratos = facade.listar();
		
		for(Contrato c:contratos){
			System.out.println(c.getId()+" "+c.getNome_empregado()+" "+c.getFuncao());
		}
	}
}
