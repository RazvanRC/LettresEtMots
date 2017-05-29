package fr.razvan.app;


import java.util.Scanner;

import fr.razvan.number.InversNumero;
import fr.razvan.string.Palindrome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int numeroInvers;
//		int numero = 0;
//				
//		System.out.println("Introduire le numero à inverser: ");
//		numero = sc.nextInt();
//		
//		numeroInvers = InversNumero.inverserNumeroInt(numero, 10);
//		String noInv = Integer.toString(numeroInvers);
//		System.out.println("Le numero inversé est: " + noInv);
//		sc.close();
		
		
		String chaine = "";
		
		System.out.println("Introduire la chaine à inverser: ");
		chaine = sc.nextLine();
			
		Palindrome.palindromePhrase(chaine);

		System.out.println("toLowerCase est: " + chaine.toLowerCase() + "; toUpperCase est: " + chaine.toUpperCase());
		sc.close();
	}

}
