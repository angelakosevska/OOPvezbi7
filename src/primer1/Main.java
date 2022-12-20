package primer1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		List <String> gradovi = new ArrayList<String>();
		gradovi.add("Ohrid");
		gradovi.add("Bitola");
		gradovi.add("Skopje");
		
		if (gradovi.get(1).equals("Bitola"))
		{
			System.out.println("Ova e mojot roden grad!");
		}
		else
		{
			System.out.println(gradovi.get(1)+" e grad vo Makedonija!");
		}

	}

}
