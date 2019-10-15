package questao8;

public class TryCatchesExemples {

/* QUESTÃO 8
 * - Explique com suas palavras o que é NullPointerException?
	Ocorre quando uma determinada variável é nula (ou seja, não está instanciada) e tentamos utilizá-la, isso faz com que
    o NullPointerException ocorra. 
   
   - Insira um código que lance NullPointerException na linha 5
   No bloco, tentamos utilizar uma variável que é nula.
   
   - Insira um código após o catch que sempre será executado, mesmo que o método fazAlgumaCoisa lance exception
   O bloco finally sempre será executado, mesmo que ocorra alguma exeption
   no método fazAlgumaCoisa.
 */

public static void main(String[] args) {

	try {
		String nula = null;
		
		if(nula.equals("nula")) {
			System.out.println("Nunca entrará aqui.");
		}
	} catch (NullPointerException e1) {
		System.out.println("deu nullPointer");
		//fazAlgumaCoisa();
	}finally {  
		System.out.println("Sempre executado");
		}
		
	}
}
