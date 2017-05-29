package fr.razvan.number;


public class InversNumero {
	
	public static int inverserNumeroInt (int numero, int base) {
		
		int reste;
		int quotient;
		int noInv = 0;
		
		do {
			reste = numero % base;
			quotient = (numero - reste) / base;
			numero = quotient;
			noInv = noInv * 10 + reste;
			
		} while (quotient != 0);
		
		return noInv;
	}
	

}
