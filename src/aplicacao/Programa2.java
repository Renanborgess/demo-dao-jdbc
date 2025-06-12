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
		Departamento novoDepartamento = new Departamento(null, "Pets");
		departamentoDao.insert(novoDepartamento);
		System.out.println("Inserido! Novo id:" + novoDepartamento.getId());
		System.out.println();

	}

}
