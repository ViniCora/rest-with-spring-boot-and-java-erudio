package br.com.erudio.utils;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class NumberUtils {
	public static Double convertToDouble(String number) throws NumberFormatException, Exception {
		if(number == null) return 0D;
		
		String n = replaceVirgula(number);
		
		if(isNumeric(n)) return Double.parseDouble(n);
		
		return 0D;
	}

	public static boolean isNumeric(String number) throws Exception {
		
		if(number == null) return false;
		
		String n = replaceVirgula(number);
		
		boolean isNumeric = n.matches("[-+]?[0-9]*\\.?[0-9]+");
		
		if(isNumeric)
			return true;
		
		throw new UnsupportedMathOperationException("Por favor utilize um valor númerico!");
	}
	
	public static String replaceVirgula(String number) {
		return number.replaceAll(",", ".");
	}
}
