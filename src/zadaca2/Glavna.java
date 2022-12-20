package zadaca2;
import java.util.*;
public class Glavna {

	public static void main(String[] args) {
		MetodiZaListaNiza metod= new MetodiZaListaNiza();
		
		List<String> lista= new ArrayList<String>();
		lista.add("niza1");
		lista.add("niza2");
		lista.add("niza3");
		metod.listaVoNiza(lista);
		
		String[] niza= {"lista1", "lista2", "lista3"};
		metod.nizaVoLista(niza);
		
	}

}
