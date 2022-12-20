package zadaca5b;

import java.util.HashSet;
import java.util.Set;

public class Glavna {

	public static void main(String[] args) {
		Set <String> mnoz1 = new HashSet<String>();
		mnoz1.add("Eden");
		mnoz1.add("Dva");
		mnoz1.add("Tri");
		mnoz1.add("Pet");
		mnoz1.add("Sedum");
		
		Set <String> mnoz2 = new HashSet <String>();
		mnoz2.add("Dva");
		mnoz2.add("Cetiri");
		mnoz2.add("Shest");
		
		//unija
		mnoz1.addAll(mnoz2);
		System.out.println(mnoz1);
	}

}
