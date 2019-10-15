package questao6;
import java.util.Scanner;

/* QUESTÃO 6
 * 
 * Escreva um método público que retorne uma String e receba uma String como parâmetro.
   - O método criado deve chamar isOld da classe Man 
   - Se o retorno do método isOld for true, seu método deve retornar “idoso” senão deve retornar “jovem” 
*/
public class Father extends Man { 
	
	
	public String ageCategory (String age) {
		int iAge = 0;
		try {
			if(!age.isEmpty()) {
				iAge = Integer.parseInt(age);
		
				if(super.isOld(iAge)) {
					return "idoso";
				}
				return "jovem";
			}
	    } catch (NumberFormatException nfe) {
	      nfe.printStackTrace();
	    }
		return "Idade não é válida";
	}
	
	public static void main(String[] args) {
		String age;
		Father father = new Father();
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a idade: ");
		age = ler.next();
		System.out.println(father.ageCategory(age));
	}
 } 