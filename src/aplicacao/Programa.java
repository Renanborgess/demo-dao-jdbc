package aplicacao;

import java.util.List;

import model.dao.FabricaDAO;
import model.dao.VendedorDAO;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDAO vendedorDao = FabricaDAO.criarVendedorDAO();
		
		System.out.println("==== TEST 1: Vendedor findById ====");
		Vendedor vendedor = vendedorDao.findById(2);
		System.out.println(vendedor);
		System.out.println();
		
		
		System.out.println("==== TEST 2: Vendedor findByDepartamento ====");
		Departamento departamento = new Departamento(4, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		for(Vendedor obj : list) {
			System.out.println(obj);
		}
		
		
		
		System.out.println(vendedor);
	}
}
