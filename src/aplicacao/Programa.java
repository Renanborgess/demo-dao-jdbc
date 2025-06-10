package aplicacao;

import model.dao.FabricaDAO;
import model.dao.VendedorDAO;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDAO vendedorDao = FabricaDAO.criarVendedorDAO();
		
		Vendedor vendedor = vendedorDao.findById(2);
		
		System.out.println(vendedor);
	}
}
