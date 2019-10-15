package questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* QUESTÃO 3
 * - Este código lança uma exception. Qual é a exception lançada e por que?
   A exceção ocorre ao executar a linha "Arrays.sort(lst.toArray());". A ordenação não consegue comparar um Inteiro com 
   uma String.

   - Por que as linhas 4, 5 e 6 não dão erro?
   Como a List "lst" que é alimentado pelas linhas 4, 5 e 6 não possui um tipo específico, não ocorre nenhum erro. Ela  
   permite a insersão de qualquer tipo de variável na lista.
 */

public class ListExample {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(new Integer(12).intValue());
		lst.add(new String("Opaa"));
		lst.add(new Boolean(true));
		Arrays.sort(lst.toArray());
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i).toString());
		}
	}
}