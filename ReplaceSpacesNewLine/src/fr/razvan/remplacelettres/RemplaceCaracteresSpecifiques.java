package fr.razvan.remplacelettres;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
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
				case '�':
					phrase.replace("�", "a");
					break;
				case '�':
					phrase.replace("�", "c");
					break;
				case '�':
					phrase.replace("�", "e");
					break;
				case '�':
					phrase.replace("�", "e");
					break;
				case '�':
					phrase.replace("�", "o");
					break;
				case '�':
					phrase.replace("�", "i");
					break;
				case '�':
					phrase.replace("�", "e");
					break;
				case '�':
					phrase.replace("�", "u");
					break;
				case '�':
					phrase.replace("�", "a");
					break;
				case '�':
					phrase.replace("�", "u");
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
