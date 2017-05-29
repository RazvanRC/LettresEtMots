package fr.razvan.string;


import java.util.ArrayList;

public class Palindrome {
	
//	public static void palindromeMot (String mot) {
//		
//		String motInvers = InversString.inverserString(mot);
//		System.out.println("L'invers du mot '" + mot + "' est le mot '" + motInvers + "'.");
//		
//		if (motInvers.equals(mot)) {
//			System.out.println("Le mot '" + mot + "' est un palindrome.");
//		} else {
//			System.out.println("Le mot '" + mot + "' n'est pas un palindrome.");
//		}
//		
//	}
	
	public static void palindromePhrase (String phrase) {
		StringBuffer sEspaces = new StringBuffer();
		String sansEspaces = "";
		ArrayList posEspaces = new ArrayList();
		
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ') {
				sEspaces.append(phrase.charAt(i));
			} else {
				posEspaces.add(i);
			}
		}
		
		sansEspaces = sEspaces.toString().toLowerCase();
		
		StringBuilder phraseInversSE = InversString.inverserString(sansEspaces);
		StringBuilder phraseInversAE = new StringBuilder();
		if (posEspaces.size() == 0) {
			phraseInversAE = phraseInversSE;
		} else {
			for (int i = 0; i < posEspaces.size(); i++) {
				phraseInversAE = phraseInversSE.insert((int) posEspaces.get(i), " ");
			}
		}
		
		String phraseInversAEstr = phraseInversAE.toString();
		System.out.println("L'invers du '" + phrase.substring(0, 1).toUpperCase() + "" + phrase.substring(1).toLowerCase() + "" + "' est '" + phraseInversAEstr.substring(0, 1).toUpperCase() + "" + phraseInversAEstr.substring(1).toLowerCase() + "'.");
		
		if (phraseInversAEstr.equals(phrase)) {
			System.out.println("'" + phrase.substring(0, 1).toUpperCase() + "" + phrase.substring(1).toLowerCase() + "' est un palindrome.");
		} else {
			System.out.println("'" + phrase.substring(0, 1).toUpperCase() + "" + phrase.substring(1).toLowerCase() + "' n'est pas un palindrome.");
		}
		
	}

}
