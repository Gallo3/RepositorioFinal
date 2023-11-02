package ejercicioPicante;

public class Exepciones {
	    public static boolean esEntero(String cadena) {
	        try {
	            Integer.parseInt(cadena);
	            return true;
	        	} catch (NumberFormatException error) {
	            return false;
	        	}
	    }
		



}

