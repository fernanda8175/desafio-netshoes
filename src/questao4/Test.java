package questao4;


/* QUESTÃO 4
 * - Quando os códigos abaixo são inseridos na linha 3, a JVM apresenta um erro de compilação. Explique com suas palavras por que os trechos a, b e c apresentam erro de compilação. 
 
   a) public String static void main(String[] args) { 
   O código apresenta erro quando a opção "a" é inserida devido a duplicidade de retornos: "void" e "String". Como este
   método main não possui retorno, devemos manter apenas o retorno "void".
  
   b) public void main(args) { 
   O código apresenta erro quando a opção "b" é inserida pois o argumento passado na função main deve possuir um tipo,
   por padrão da linguagem, utilizamos a "String", uma vez que o args é responsável por armazenar qualquer
   argumento enviado por linha de comando durante a execução do programa.
   Além disso, o "static" permite que a main() seja chamado sem que haja nenhuma instância da classe. Isso se faz necessário 
   pois o método main() é chamado pela JVM antes que qualquer objeto seja construído.
 
   c) public main(String[] args) { 
   O código apresenta erro quando a opção "c" é inserida pois devemos atribuir qual o tipo do retorno do métoto, neste caso, "void".
   Além disso, o "static" permite que a main() seja chamado sem que haja nenhuma instância da classe. Isso se faz necessário 
   pois o método main() é chamado pela JVM antes que qualquer objeto seja construído.
  */

public class Test { 
	
	 public static void main(String[] args) { 
	 	System.out.println("hi");
		
	 }
} 