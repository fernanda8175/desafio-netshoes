package questao2;

/* QUESTÃO 2
 * - Por que o código lança uma exception StackOverflowError? 
    A pilha de execução, que aloca os dados quando rodamos o código, teve a sua capacidade estourada. 
    Isso ocorreu quando o código entrou em um loop infinito após chamar a classe NumericInput. O método "add" foi escrito 
    de forma recursiva, o que pode ser visto na linha '19. add(c);'. 
    Poderia remover esta recursão realizando a chamada do UserInput, através do comando "super.add(c);".
    
    - Qual outra expressão regular poderia ser utilizada na linha 24 para garantir que a String é um número inteiro e positivo?
    É possível utilizar a expressão regular ^[1-9]*$, que valida a existencia dos caracteres de 1 a 9, sempre iniciando em     
    número, que podem ser repetidos zero ou mais vezes.
 */

public class UserInput {
	public static class TextInput {
		StringBuilder values = new StringBuilder();

		public void add(char c) {
			values.append(c);
		}

		public String getValue() {
			return values.toString();
		}
	}

	public static class NumericInput extends TextInput {
		public void add(char c) {
			if (isNumeric(String.valueOf(c))) {
				super.add(c);
			}
		}
		
		public static boolean isNumeric(String str) {
			return str.matches("^[0-9]*");
		}
	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('-');
		input.add('1');
		input.add('a');
		input.add('0');
		input.add('B');
		input.add('&');
		input.add('9');
		System.out.println(input.getValue());
	}
}


