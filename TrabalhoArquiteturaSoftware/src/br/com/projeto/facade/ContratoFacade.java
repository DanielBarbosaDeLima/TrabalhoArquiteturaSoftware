package br.com.projeto.facade;

import java.sql.SQLException;
import java.util.List;

import br.com.projeto.DAO.FactoryDao;
import br.com.projeto.entity.Contrato;

public class ContratoFacade {
	public void cadastrar(Contrato c){
			FactoryDao.createPacote_SeguroDAO().cadastrar(c);
	}
	
	public List<Contrato>listar(){
		return FactoryDao.createPacote_SeguroDAO().listar();
	}
	
	public void excluir(Contrato c){
			FactoryDao.createPacote_SeguroDAO().excluir(c);
	}

}
