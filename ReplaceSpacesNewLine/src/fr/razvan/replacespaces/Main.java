package fr.razvan.replacespaces;

import java.io.IOException;

import fr.razvan.remplacelettres.RemplaceCaracteresSpecifiques;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RemplaceCaracteresSpecifiques.remplaceCaracteresSpecifiques("../mots10lettres.txt", "../mots10lettresb.txt");
		RemplaceEspaces.remplaceEspacesAvecNouvelleLigne("../mots10lettresb.txt", "../mots10lettresnewline.txt");

	}

}
