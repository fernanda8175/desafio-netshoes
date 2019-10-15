package questao5;


/* QUESTÃO 5 
 * - Explique com suas palavras o que acontece quando a linha 15 é executada.
   Sempre que a classe Son é instanciada, o construtor Son() chama a classe Father através do comando 'super("Father")'.
   Como a classe Father é uma extensão da Man, o construtor da Man também será executado, rodando a linha
   "System.out.println("Man me");".
   Logo após, o construtor da classe Father é executado, rodando o comando "System.out.println(type + " eu");".

   - O que aconteceria se a classe Son tivesse apenas um construtor privado?
   Com o construtor privado, continuamos acessando as classes "pai", que a extende.
   O que pode acontecer é que esta classe não pode ser instanciada de fora.
 */
public class Son extends Father {
	private Son() {
		super("Father");
		new Father("Son");
	}

	public static void main(String[] args) {
		new Son();
	}
}
