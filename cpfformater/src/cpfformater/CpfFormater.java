package cpfformater;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CpfFormater {

	public static void main(String[] args) {
		long cpf = 12345454322l;
		System.out.print(format(cpf)); 
	}



	private static String format(long cpf){ 
		MaskFormatter mask; 
		try { 
			mask = new MaskFormatter("###.###.###-##"); 
			mask.setValueContainsLiteralCharacters(false); 
			String teste = Long.toString(cpf);
			teste = mask.valueToString(teste);
			
			return teste;
		}
		catch (ParseException e) { 
			throw new RuntimeException(e); 
		} 
	}
		


}

