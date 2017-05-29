package fr.razvan.comptagemots;


import java.io.*;
import java.util.*;

import fr.razvan.outils.Paire;

public class CompterMotsTri {
	
	
	public static void main(String[] argv) throws IOException {
		Hashtable<String,Paire<String,Integer>> table = new Hashtable<>();
		//BufferedReader entree = new BufferedReader(new FileReader(argv[0]));
		
		BufferedReader entree = new BufferedReader(new InputStreamReader(
		                      new FileInputStream("../20000lieues-VERNE.txt"), "UTF8"));
		
		FileWriter sortie = new FileWriter("listeDeMots.txt");
		
		String ligne;
		StringTokenizer st;
		String mot;
		Paire<String,Integer> psi = null;

		
		while ((ligne = entree.readLine()) != null) {
			st = new StringTokenizer(ligne, " ,.;:_-+*/\\.;\n\"'{}()=><\t!?");
			
			while (st.hasMoreTokens()) {
				mot = st.nextToken();
				if (mot.length()>2) {
				if (table.containsKey(mot)) {
					psi = table.get(mot);
					psi.setValue(psi.getValue()+1);
				} else
					psi = new Paire<String,Integer>(mot,1);
				
				table.put(mot,psi);
				}
			}
		}

		System.out.println(table);
		// Enumeration vers une LISTE
		List tmp = Collections.list(table.elements());
		
		// Tri de la liste
		Collections.sort(tmp);
		
		Iterator<Paire<String,Integer>> it = tmp.iterator();
		int cmp=0;
		while (it.hasNext()) {
			psi = it.next();
			

			sortie.write("Le mot '" + psi.getKey() 
				+ "' figure '" + psi.getValue() + "' fois" + "\r\n");
//			System.out.println("Le mot " + psi.getKey() 
//				+ " figure " + psi.getValue() + " fois");
		}
		
		if (entree!=null) entree.close();
		sortie.close();
	}
}