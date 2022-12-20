package zadaca1;
import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
		public static void main(String[] args) {
			List <String> lekovi = new ArrayList<String>();
			lekovi.add("Analgin");
			lekovi.add("Paracetamol");
			lekovi.add("VitaminC");
			lekovi.add("Benalgin");
			
			if (lekovi.get(lekovi.size()-1).equals("Paracetamol"))
			{
				System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura!");
			}
			else
			{
				System.out.println("Namenata na lekot e nepoznata");
			}

		}

}
