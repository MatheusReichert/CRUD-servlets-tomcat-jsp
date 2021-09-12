package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void adicionar(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> retornaLista(){
		return lista;
	}
	
	static {
		Empresa teste1 = new Empresa("Teste", 1, new Date());
		Empresa teste2 = new Empresa("Teste", 2, new Date());
		Banco.lista.add(teste1);
		Banco.lista.add(teste2);
	}

	public void removeEmpresa(int id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		
		
		
	}

	public Empresa buscaEmpresaId(int id) {
		
		for(Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	
}
