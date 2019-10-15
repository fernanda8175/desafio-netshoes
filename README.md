# desafio-netshoes
### Desenvolvedor Back End - Java

O projeto possui 10 pacotes, um para cada questão do desafio. Para executar, basta entrar no pacote da questão na IDE e executá-lo.

#### 1) Explique com suas palavras o que acontece quando o código acima é executado.
   O método main já é executado como uma thread dedicada.
   Neste código, criamos mais uma thread do metodo Test, que após o start(), executará o método run().
   A thread principal e a criada serão executados em paralelo, ou seja, cada thread tem a sua propria pilha de métodos.
   No método run não é permitido o throw, uma vez que teria que alterar a assinatura da sua interface. O correto seria utilizar um try/catch.

#### 2) Por que o código lança uma exception StackOverflowError? 
   A pilha de execução, que aloca os dados quando rodamos o código, teve a sua capacidade estourada. 
   Isso ocorreu pois o código entrou em um loop infinito após chamar a classe NumericInput, o método add chama ele mesmo
   através da linha '19. add(c)';
#### - Qual outra expressão regular poderia ser utilizada na linha 24 para garantir que a String é um número inteiro e positivo?
  A expressão regular: ^[1-9]*$
  Pois valida se possui caracteres de 1 a 9, sempre iniciando em número, que podem ser repetidos zero ou mais vezes.
  
#### 3) Este código lança uma exception. Qual é a exception lançada e por que? 
   A exceção ocorre ao tentar executar a linha:
    7.  Arrays.sort(lst.toArray());
   Pois a ordenação não consegue comparar um Inteiro com uma String.
#### - Por que as linhas 4, 5 e 6 não dão erro?
   As linhas 4, 5 e 6 não dão erro pois o ArrayList possui tipo genérico. Assim, podemos inserir qualquer tipo de dado nele.
  
#### 4) Quando os códigos abaixo são inseridos na linha 3, a JVM apresenta um erro de compilação. Explique com suas palavras por que os trechos a, b e c apresentam erro de compilação. 
  ##### a) public String static void main(String[] args) { 
   O código apresenta erro quando a opção "a" é inserida devido a duplicidade de retornos: "void" e "String". Como este
   método main não possui retorno, devemos manter apenas o retorno "void".
  ##### b) public void main(args) { 
   O código apresenta erro quando a opção "b" é inserida pois o argumento passado na função main deve possuir um tipo,
   por padrão da linguagem, utilizamos a "String", uma vez que o args é responsável por armazenar qualquer
   argumento enviado por linha de comando durante a execução do programa.
  ##### c) public main(String[] args) { 
   O código apresenta erro quando a opção "c" é inserida pois devemos atribuir qual o tipo do retorno do métoto. Neste  
  caso, "void"
  
#### 5) - Explique com suas palavras o que acontece quando a linha 15 é executada.
   Sempre que a classe Son é instanciada, o contrutor Son() chama a classe Father, que por sua vez, chama a Man, uma vez que a    Father extende a classe Man.  
#### - O que aconteceria se a classe Son tivesse apenas um construtor privado?
   Com o construtor privado, continuamos acessando as classes "pai", que extendem ela.
   O que pode acontecer é que esta classe nao pode ser instanciada de fora.
   
#### 6)Escreva um método público que retorne uma String e receba uma String como parâmetro.
#### - O método criado deve chamar isOld da classe Man 
#### - Se o retorno do método isOld for true, seu método deve retornar “idoso” senão deve retornar “jovem” 
  Os códigos estã no pacote "questoa6".

#### 7)- Quem pode acessar e alterar a variável desta classe? Justifique sua resposta. 
 ##### a) Qualquer classe pode instanciar e alterar a variável name 
 ##### b) Qualquer classe dentro do mesmo package 
 ##### c) Qualquer classe que chame o método setName(String name) 
  Opção "b". Como o atributo é public, qualquer classe que instancie Big, poderia alterar e visualizar as informações contidas   em "name".
  Porém, como a classe não possui nenhum modificador, o default é que apenas as classes que estiverem no mesmo pacote possam     acessa-la.
  
#### 8) Explique com suas palavras o que é NullPointerException?
   Ocorre quando uma determinada variável é nula(ou seja, não está instanciada) e tentamos utilizá-la, isso faz com que
	 o NullPointerException ocorra. 
#### - Insira um código que lance NullPointerException na linha 5
   No bloco, tenta utilizar uma variável que é nula.
#### - Insira um código após o catch que sempre será executado, mesmo que o método fazAlgumaCoisa lance exception
   O bloco finally sempre será executado, mesmo que ocorra alguma exeption
	 no método fazAlgumaCoisa.
   
#### 10) Converta a variável x para a variável y do tipo integer. 
  O código está no pacote "questoa10".
#### 11) Insira o trecho de código para que o resultado exibido seja: 1.99
   O código está no pacote "questoa11".
