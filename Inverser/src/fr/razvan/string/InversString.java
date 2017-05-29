package fr.razvan.string;


public class InversString {
	
	public static StringBuilder inverserString (String mot) {
		
//		String motInvers = "";
		char character;
		int pos;
		StringBuilder motInvers = new StringBuilder();
			
		for (int i = 0; i < mot.length(); i++) {
			character = mot.charAt(i);
			pos = mot.length() - i - 1;
			motInvers.append(mot.charAt(pos));

//			motInvers.insert(pos, c);
		}
//		motInvers = motInvers.toString();
		
		return motInvers;
		
	}

}
