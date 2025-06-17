package aplicacao;

import java.util.Scanner;

import model.dao.DepartamentoDAO;
import model.dao.FabricaDAO;
import model.dao.VendedorDAO;
import model.entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartamentoDAO departamentoDao = FabricaDAO.criarDepartamento();
		
		System.out.println("==== TEST 1: Departamento insert ====");
		Departamento novoDepartamento = new Departamento(null, "Comida");
		departamentoDao.insert(novoDepartamento);
		System.out.println("Inserido! Novo id: " + novoDepartamento.getId());
		System.out.println();
		
		System.out.println("==== TEST 2: Departamento findById ====");
		Departamento dep1 = departamentoDao.findById(8);
		System.out.println(dep1);
		System.out.println();
		
		System.out.println("==== TEST 3: Departamento update ====");
		Departamento dep2 =  departamentoDao.findById(9);
		dep2.setNome("Futebol");
		departamentoDao.update(dep2);		
		System.out.println("Registro atualizado!" + " Novo nome: " + dep2.getNome());
		System.out.println();
		
		System.out.println("==== TEST 4: Departamento deleteById ====");
		System.out.print("Digite o ia que você deseja deletar: ");
		int id = sc.nextInt();
		departamentoDao.deleteById(id);
		System.out.println("Deletado com sucesso!");

	}

}
