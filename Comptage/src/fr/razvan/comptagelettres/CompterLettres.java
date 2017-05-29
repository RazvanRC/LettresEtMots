package fr.razvan.comptagelettres;


import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.razvan.outils.Paire;

public class CompterLettres {

	// constructeur
	public CompterLettres() {
	}

	Hashtable<String, Paire<String, Integer>> table = new Hashtable<>();
	// fonction qui trait la chaine de caractère
	public int[] vect(String s) {
		// recuperer la list de caractère
		String str = "";
		char data[] = new char[1];
		for (int a = 0; a < s.length(); a++) {
			if (str.contains(String.valueOf(s.charAt(a))) == false) {
				char c = Character.valueOf(s.charAt(a));
				data[0] = c;
				str = str + String.valueOf(data);
				
			}
		}
		//String[] str2 = str.split("");
		System.out.println(str);
		Paire<String,Integer> psi = new Paire<String,Integer>();
		// comparaison des caractères
		int tab[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			int compteur = 0;
			psi = new Paire<String,Integer>(String.valueOf(str.charAt(i)),0);
			for (int index = 0; index < s.length(); index++)
				if (str.charAt(i) == s.charAt(index)) {
					compteur++;
//					psi = table.get(String.valueOf(str.charAt(i)));
					psi.setValue(psi.getValue()+1);
				}
			tab[i] = compteur;
			table.put(String.valueOf(str.charAt(i)), psi);
			
//			System.out.println("caractère : " + str.charAt(i) + "   nombre d'occurence de :" + tab[i]);
		}
//		System.out.println(table);
		// Enumeration vers une LISTE
		List tmp = Collections.list(table.elements());

		// Tri de la liste
		Collections.sort(tmp);
		System.out.println(tmp);
		
		Iterator<Paire<String, Integer>> it = tmp.iterator();
		int cmp=0;
		while (it.hasNext()) {
			psi = it.next();
			
			System.out.println("La lettre " + psi.getKey() 
				+ " figure " + psi.getValue() + " fois.");
		}
		
		return tab;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("introduire une phrase: ");
		String s = sc.nextLine();
		sc.close();
		CompterLettres v = new CompterLettres();
		v.vect(s.toLowerCase());
	}
}
