package aplicacao;

import java.util.Date;

import model.dao.FabricaDAO;
import model.dao.VendedorDAO;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "Livros");
		
		Vendedor vendedor = new Vendedor(20, "Renan", "renanborgessti@gmail.com", new Date(), 4800.00);
		
		VendedorDAO vendedorDao = FabricaDAO.criarVendedorDAO();
		
		System.out.println(vendedor);
		
	}

}
