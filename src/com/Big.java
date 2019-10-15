 package com; 
 
/* QUESTÃO 7
 * - Quem pode acessar e alterar a variável desta classe? Justifique sua resposta. 
   a) Qualquer classe pode instanciar e alterar a variável name 
   b) Qualquer classe dentro do mesmo package 
   c) Qualquer classe que chame o método setName(String name) 
   Opção "b". Como o atributo é public, qualquer classe que instancie Big poderia alterar e visualizar as informações contidas   em "name".
   Porém, como a classe não possui nenhum modificador, o default é que apenas as classes que estiverem no mesmo pacote possam     acessa-la.
 */
 
 class Big {
 public String name = "hello";
}