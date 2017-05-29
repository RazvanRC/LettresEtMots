package fr.razvan.comptagelettres;


import java.util.Scanner;

public class CompterVoyelles {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comp[] = new int[8];
		System.out.print("Donnez un mot : ");
		String mot = sc.nextLine();
		String motSansEspaces = "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < mot.length(); i++) {
			if (mot.charAt(i) != ' ') {
				sb.append(mot.charAt(i));
			}
		}
		sc.close();
		motSansEspaces = sb.toString();
		//motSansEspaces
//		System.out.println(motSansEspaces);
		for (int i = 0; i < motSansEspaces.length(); i++) {
			
			switch (motSansEspaces.charAt(i)) {
			case 'a':
				comp[0]++;
				break;
			case 'A':
				comp[0]++;
				break;
			case 'e':
				comp[1]++;
				break;
			case 'é':
				comp[2]++;
				break;
			case 'è':
				comp[3]++;
				break;
			case 'E':
				comp[1]++;
				break;
			case 'i':
				comp[4]++;
				break;
			case 'I':
				comp[4]++;
				break;
			case 'o':
				comp[5]++;
				break;
			case 'O':
				comp[5]++;
				break;
			case 'u':
				comp[6]++;
				break;
			case 'U':
				comp[6]++;
				break;
			case 'y':
				comp[7]++;
				break;
			case 'Y':
				comp[7]++;
				break;
			}
		}
		System.out.println(comp[0] + " fois la lettre a");
		System.out.println(comp[1] + " fois la lettre e");
		System.out.println(comp[2] + " fois la lettre é");
		System.out.println(comp[3] + " fois la lettre è");
		System.out.println(comp[4] + " fois la lettre i");
		System.out.println(comp[5] + " fois la lettre o");
		System.out.println(comp[6] + " fois la lettre u");
		System.out.println(comp[7] + " fois la lettre y");
	}


}
