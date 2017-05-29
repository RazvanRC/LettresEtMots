package fr.razvan.outils;

public class SecuritySystem {
	
	private static SecuritySystem comptermots;
	
	private SecuritySystem() {
	}
	
	
	public static SecuritySystem getInstance() {
		if (comptermots==null) {
			comptermots = new SecuritySystem();
		}
		return comptermots;
		
	}
	
	public boolean authentification(String user, String password) {
		return true;
	}

	
}
