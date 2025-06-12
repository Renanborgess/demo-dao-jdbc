package aplicacao;

import java.util.Date;
import java.util.List;

import model.dao.FabricaDAO;
import model.dao.VendedorDAO;
import model.dao.impl.VendedorDaoJDBC;
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
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		for(Vendedor obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("==== TEST 3: Vendedor findAll ====");
		list = vendedorDao.findAll();
		for(Vendedor obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("==== TEST 4: Vendedor insert ====");
		Vendedor novoVendedor = new Vendedor(null, "Jade", "jade@baby.com.br", new Date(), 6000.0, departamento);
		vendedorDao.insert(novoVendedor);
		System.out.println("Inserido! Novo Id: " + novoVendedor.getId());
		System.out.println();
		
		System.out.println("==== TEST 5: Vendedor Update ====");
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Almir borges");
		vendedorDao.update(vendedor);
		System.out.println("Update feito!");
	}	
}
