package domain;

import java.util.ArrayList;
import java.util.List;


public class CategoriaResource {
	
	public List<Categoria> listar(){
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(new Categoria(1, "Informática"));
		return lista;
	}
}
