# desafio-netshoes
### Desenvolvedor Back End - Java
Fernanda Rosa de Oliveira

O projeto possui 10 pacotes, um para cada questão do desafio. É necessário importar o projeto em uma IDE e executar cada um dos pacotes.

#### 1) Explique com suas palavras o que acontece quando o código acima é executado.
   O método main já é executado com uma thread dedicada.
   Neste código, criamos mais uma thread da classe Test e ela executará, após o start(), o método run().
   A thread principal (main) e a criada (t) serão executados em paralelo, ou seja, cada thread tem a sua propria pilha de 
   métodos.
   A thread principal executará até o System.out.println("Executou até o final do Método. ");
   Já a thread t, executará até o RuntimeException("Opa, temos um problema! ").
   
   No método run não é aconselhado o throw, pois, para tal ação, a assinatura da interface deveria sofrer uma alteração. 
   O ideal seria utilizar um try/catch.

#### 2) Por que o código lança uma exception StackOverflowError? 
   A pilha de execução, que aloca os dados quando rodamos o código, teve a sua capacidade estourada. 
   Isso ocorre quando o código entra em um loop infinito após chamar a classe NumericInput. O método "add" foi escrito de   
   forma recursiva, o que pode ser visto na linha '19. add(c);'. 
   Essa recursão poderia ser removida realizando a chamada do UserInput, através do comando "super.add(c);".
  
#### - Qual outra expressão regular poderia ser utilizada na linha 24 para garantir que a String é um número inteiro e positivo?
  É possível utilizar a expressão regular ^[1-9]*$, que valida a existencia dos caracteres de 1 a 9, sempre iniciando em     
  número, que podem ser repetidos zero ou mais vezes.

#### 3) Este código lança uma exception. Qual é a exception lançada e por que? 
   A exceção ocorre ao executar a linha "7.  Arrays.sort(lst.toArray());". A ordenação não consegue comparar um Inteiro com 
   uma String.
#### - Por que as linhas 4, 5 e 6 não dão erro?
   Como a List "lst" que é alimentado pelas linhas 4, 5 e 6 não possui um tipo específico, não ocorre nenhum erro. Ela  
   permite a insersão de qualquer tipo de variável na lista.
  
#### 4) Quando os códigos abaixo são inseridos na linha 3, a JVM apresenta um erro de compilação. Explique com suas palavras por que os trechos a, b e c apresentam erro de compilação. 
  ##### a) public String static void main(String[] args) { 
   O código apresenta erro quando a opção "a" é inserida devido a duplicidade de retornos: "void" e "String". Como este
   método main não possui retorno, devemos manter apenas o retorno "void".
  ##### b) public void main(args) { 
   O código apresenta erro quando a opção "b" é inserida pois o argumento passado na função main deve possuir um tipo,
   por padrão da linguagem, utilizamos a "String", uma vez que o args é responsável por armazenar qualquer
   argumento enviado por linha de comando durante a execução do programa.
   Além disso, o "static" permite que a main() seja chamado sem que haja nenhuma instância da classe. Isso se faz necessário 
   pois o método main() é chamado pela JVM antes que qualquer objeto seja construído.
  ##### c) public main(String[] args) { 
   O código apresenta erro quando a opção "c" é inserida pois devemos atribuir qual o tipo do retorno do métoto, neste caso,      "void".
   Além disso, o "static" permite que a main() seja chamado sem que haja nenhuma instância da classe. Isso se faz necessário 
   pois o método main() é chamado pela JVM antes que qualquer objeto seja construído.
 
#### 5) - Explique com suas palavras o que acontece quando a linha 15 é executada.
   Sempre que a classe Son é instanciada, o construtor Son() chama a classe Father através do comando 'super("Father")'.
   Como a classe Father é uma extensão da Man, o construtor da Man também será executado, rodando a linha
   "System.out.println("Man me");".
   Logo após, o construtor da classe Father é executado, rodando o comando "System.out.println(type + " eu");".
#### - O que aconteceria se a classe Son tivesse apenas um construtor privado?
   Com o construtor privado, continuamos acessando as classes "pai", que a extende.
   O que pode acontecer é que esta classe não pode ser instanciada de fora.
   
#### 6)Escreva um método público que retorne uma String e receba uma String como parâmetro.
#### - O método criado deve chamar isOld da classe Man 
#### - Se o retorno do método isOld for true, seu método deve retornar “idoso” senão deve retornar “jovem” 
  Os códigos estão no pacote "questoa6".

#### 7)- Quem pode acessar e alterar a variável desta classe? Justifique sua resposta. 
 ##### a) Qualquer classe pode instanciar e alterar a variável name 
 ##### b) Qualquer classe dentro do mesmo package 
 ##### c) Qualquer classe que chame o método setName(String name) 
  Opção "b". Como o atributo é public, qualquer classe que instancie Big poderia alterar e visualizar as informações contidas   em "name".
  Porém, como a classe não possui nenhum modificador, o default é que apenas as classes que estiverem no mesmo pacote possam     acessa-la.
  
#### 8) Explique com suas palavras o que é NullPointerException?
   Ocorre quando uma determinada variável é nula (ou seja, não está instanciada) e tentamos utilizá-la, isso faz com que
   o NullPointerException ocorra. 
#### - Insira um código que lance NullPointerException na linha 5
   No bloco, tentamos utilizar uma variável que é nula.
#### - Insira um código após o catch que sempre será executado, mesmo que o método fazAlgumaCoisa lance exception
   O bloco finally sempre será executado, mesmo que ocorra alguma exeption
   no método fazAlgumaCoisa.
   
#### 10) Converta a variável x para a variável y do tipo integer. 
  O código está no pacote "questoa10".
#### 11) Insira o trecho de código para que o resultado exibido seja: 1.99
   O código está no pacote "questoa11".
