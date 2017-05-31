package fr.razvan.replacespaces;

import java.io.IOException;

import fr.razvan.remplacelettres.RemplaceCaracteresSpecifiques;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RemplaceCaracteresSpecifiques.remplaceCaracteresSpecifiques("../liste_mots_mix.txt", "../liste_mots_mixb.txt");
		RemplaceEspaces.remplaceEspacesAvecNouvelleLigne("../liste_mots_mix.txt", "../liste_mots_mixnewline.txt");
		
	}

}
