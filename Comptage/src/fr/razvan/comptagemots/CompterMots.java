package fr.razvan.comptagemots;


import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class CompterMots {
	
	
	public static void main(String[] argv) throws IOException {
		Hashtable<String,Integer> table = new Hashtable<>();
		//BufferedReader entree = new BufferedReader(new FileReader(argv[0]));
		
		BufferedReader entree = new BufferedReader(new InputStreamReader(
		                      new FileInputStream("../20000lieues-VERNE.txt"), "UTF8"));
		
		String ligne;
		StringTokenizer st;
		String mot;
		int nbOcc;

		
		while ((ligne = entree.readLine()) != null) {
			st = new StringTokenizer(ligne, " ,.;:_-+*/\\.;\n\"'{}()=><\t!?");
			while (st.hasMoreTokens()) {
				mot = st.nextToken();
				if (table.containsKey(mot)) {
					nbOcc = ((Integer) table.get(mot)).intValue();
					nbOcc++;
				} else
					nbOcc = 1;
				table.put(mot, new Integer(nbOcc));
			}
		}
		Enumeration<String>lesMots = table.keys();
		while (lesMots.hasMoreElements()) {
			mot = (String) lesMots.nextElement();
			nbOcc = ((Integer) table.get(mot)).intValue();
			System.out.println("Le mot " + mot + " figure " + nbOcc + " fois");
		}
		
		if (entree!=null) entree.close();
	}
}