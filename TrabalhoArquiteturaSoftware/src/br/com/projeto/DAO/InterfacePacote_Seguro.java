package br.com.projeto.DAO;

import java.sql.SQLException;
import java.util.List;

import br.com.projeto.entity.Contrato;

public interface InterfacePacote_Seguro {
	public void cadastrar(Contrato c);
	public void excluir(Contrato c);
	public List<Contrato>listar();
	

}
