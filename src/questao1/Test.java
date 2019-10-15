package questao1;

/* QUESTÃO 1
 * - Explique com suas palavras o que acontece quando o código acima é executado.
  	 O método main já é executado com uma thread dedicada.
     Neste código, criamos mais uma thread da classe Test e ela executará, após o start(), o método run().
     A thread principal (main) e a criada (t) serão executados em paralelo, ou seja, cada thread tem a sua propria pilha de 
     métodos.
     A thread principal executará até o System.out.println("Executou até o final do Método. ");
     Já a thread t, executará até o RuntimeException("Opa, temos um problema! ").
     
     No método run não é aconselhado o throw, pois, para tal ação, a assinatura da interface deveria sofrer uma alteração. 
     O ideal seria utilizar um try/catch.	
 */

public class Test implements Runnable{

	public static void main(String[] args) {
		Thread t = new Thread(new Test());
		t.start();
		System.out.println("Executou até o final do Método. ");
	}

	@Override
	public void run() {
			throw new RuntimeException("Opa, temos um problema! ");
	}

}
