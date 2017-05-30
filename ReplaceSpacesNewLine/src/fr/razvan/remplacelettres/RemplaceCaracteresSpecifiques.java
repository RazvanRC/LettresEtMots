package fr.razvan.remplacelettres;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class RemplaceCaracteresSpecifiques {

	public static void remplaceCaracteresSpecifiques(String fileIntro, String fileExit) throws IOException {

		BufferedReader entree = new BufferedReader(new InputStreamReader(new FileInputStream(fileIntro), "UTF8"));

		FileWriter sortie = new FileWriter(fileExit);
		String phrase = new String();
		// phrase = Normalizer.
		Stream<String> liste = entree.lines();
		Iterator<String> it = liste.iterator();
		while (it.hasNext()) {
			phrase = it.next();
			for (int i = 0; i < phrase.length(); i++) {
				char caractere = ' ';
				switch (caractere) {
				case 'â':
					phrase.replace("â", "a");
					break;
				case 'ç':
					phrase.replace("ç", "c");
					break;
				case 'é':
					phrase.replace("é", "e");
					break;
				case 'è':
					phrase.replace("è", "e");
					break;
				case 'ô':
					phrase.replace("ô", "o");
					break;
				case 'î':
					phrase.replace("î", "i");
					break;
				case 'ê':
					phrase.replace("ê", "e");
					break;
				case 'û':
					phrase.replace("û", "u");
					break;
				case 'à':
					phrase.replace("à", "a");
					break;
				case 'ù':
					phrase.replace("ù", "u");
					break;

				default:
					break;
				}

			}
			sortie.write(phrase+"/r/n");
			System.out.println(phrase);
		}
		
		entree.close();
		sortie.close();

	}

}
