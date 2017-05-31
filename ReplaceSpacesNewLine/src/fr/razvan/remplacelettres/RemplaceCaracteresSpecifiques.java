package fr.razvan.remplacelettres;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

public class RemplaceCaracteresSpecifiques {

	public static void remplaceCaracteresSpecifiques(String fileIntro, String fileExit) throws IOException {

		BufferedReader entree = new BufferedReader(new InputStreamReader(new FileInputStream(fileIntro), "UTF8"));

		FileWriter sortie = new FileWriter(fileExit);
		String phrase = new String();
		// phrase = Normalizer.
		// Stream<String> liste = entree.lines();
		// Iterator<String> it = liste.iterator();

		while (phrase != null) {
			phrase = entree.readLine();
			if(phrase == null){
				break;
			}

//			System.out.println(phrase);
//			phrase = phrase.replaceAll("[0-9]", "");
			phrase = Normalizer.normalize(phrase, Normalizer.Form.NFD);
			phrase = phrase.replaceAll("\\p{M}", "");
			
			// for (int i = 0; i < phrase.length(); i++) {
			// char caractere = ' ';
			//
			// }
			sortie.write(phrase);
//			System.out.println(phrase);
		}

		entree.close();
		sortie.close();

	}

}
