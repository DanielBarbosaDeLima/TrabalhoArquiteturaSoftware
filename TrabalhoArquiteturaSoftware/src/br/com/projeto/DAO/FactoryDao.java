package br.com.projeto.DAO;

public class FactoryDao {
	
	public static InterfacePacote_Seguro createPacote_SeguroDAO(){
		return new ContratoDAO();
	}

}
