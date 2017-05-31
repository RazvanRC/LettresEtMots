package fr.razvan.replacespaces;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


/*
 * remplace les espaces avec des retours a la ligne
 * pour mettre chaque mot d'une "phrase" sur une nouvelle ligne
 */
public class RemplaceEspaces {
	
	public static void remplaceEspacesAvecNouvelleLigne (String fileIntro, String fileExit) throws IOException {
		
		BufferedReader entree = new BufferedReader(new InputStreamReader(
                new FileInputStream(fileIntro), "UTF-8"));

		OutputStreamWriter sortie = new OutputStreamWriter(new FileOutputStream(fileExit), "UTF-8");
		//FileWriter sortie = new FileWriter(fileExit);
		
		String ligne;
		StringTokenizer st;
		String mot = "";
			
		while ((ligne = entree.readLine()) != null) {
			st = new StringTokenizer(ligne, " ,.;:_+*/\\.;\r\n\"'{}()=><\t!?");
			
			while (st.hasMoreTokens()) {
				mot = st.nextToken();
				sortie.write(mot + "\r\n");
			}
		}
//		for (int i = 0; i < entree.length(); i++) {
//			if (phrase.charAt(i) != ' ') {
//				phrase.replace(" ", "\r\n");
//			}
//		}
//		
		
		entree.close();
		sortie.close();
		
	}

}
