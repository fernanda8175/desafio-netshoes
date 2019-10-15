package questao11;

import java.math.BigDecimal;

/* QUESTÃO 11
 * - Insira o trecho de código para que o resultado exibido seja: 1.99
 */

public class main {
	
	public static void main(String args[]) {
		double num = 1.999;
		BigDecimal x = BigDecimal.valueOf(num);
		x = x.setScale(2, BigDecimal.ROUND_DOWN);
		System.out.print(x);
	}

}
