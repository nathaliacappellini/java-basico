public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
    // Tipos Primitivos:

        /* Atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos short e byte, 
        pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido. Da mesma forma, 
        dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes. */

        byte tipoUm = 100; //Para valores entre -128 e 127.

        short tipoDois = 30000; //Para valores entre -32768 e 32767.

        int tipoTres = 27000000; //Para valores entre -2147483648 e 2147483647.

        long tipoQuatro = 9223372036854775807L; //Para valores entre -9223372036854775808 e 9223372036854775807. Porém, para números muito longos, como valores mínimos e máximos, é necessário utilizar o sufixo L para que o valor seja aceito como long.

        // Tipos primitivos que podem conter partes fracionárias:

            float tipoCinco = -24.321F; //Os tipos float sempre irão possuir o caractere “F” no final do valor para sua identificação.
        
            double tipoSeis = 0.573454733; 

            /* Apesar de o tipo 'float', ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de 
            uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos...
            Enquanto o 'double' mantém uma precisão decimal de 15 dígitos. */
        
        // Outros tipos: 

        boolean tipoSete = true; //Armazena dois valores: true ou false. O valor "false" pode ser representado por 0 e o "true" por 1.

        char tipoOito = 'A'; //O tipo 'char' é um tipo de dado primitivo que armazena um único caractere Unicode de 16 bits. Pode armazenar qualquer caractere, incluindo letras, números, símbolos e caracteres especiais.


    //Classe String (Representa texto na aplicação):
    
        /* Em Java, a classe 'String' é usada para representar sequências de caracteres. 
        Ao contrário dos tipos primitivos, String é uma classe, o que significa que é um tipo de dado 
        por referência que possui métodos e funcionalidades associadas. */
    
        String saudacao = "Olá, mundo!"; //Literal String.

        String outraSaudacao = new String("Olá, mundo!"); //Usando o operador 'new'.

        //Concatenação: Strings podem ser concatenadas usando o operador '+':
        
        String parte1 = "Olá, ";
        String parte2 = "mundo!";
        String maisUmaSaudacao = parte1 + parte2;  //Resulta em "Olá, mundo!"

        // A classe String possui muitos métodos úteis para manipulação e processamento de strings, incluindo: 

        int tamanho = saudacao.length();  //Retorna o comprimento da String.

        char primeiroCaractere = saudacao.charAt(0);  //Retorna o caractere na posição especificada.

        String sub = saudacao.substring(0, 5);  //Retorna uma nova string que é um subconjunto da original.

        String minusculas = saudacao.toLowerCase();  //Converte todos os caracteres da string para minúsculas.

        String maiusculas = saudacao.toUpperCase();  //Converte todos os caracteres da string para maiúsculas.

        boolean contem = saudacao.contains("mundo");  //Verifica se a string contém a sequência especificada.

        String novaSaudacao = saudacao.replace("mundo", "Java");  //Substitui todas as ocorrências de uma sequência de caracteres por outra.

        String a = "teste";
        String b = "teste";
        boolean igual = a.equals(b);  //Para comparar o conteúdo de duas strings, usa-se o método 'equals()' em vez do operador '=='.

    // Exemplo de Uso:

        String testeSaudacao = "Olá, mundo!";
        System.out.println("Saudação: " + testeSaudacao);
        System.out.println("Comprimento: " + testeSaudacao.length());
        System.out.println("Primeiro Caractere: " + testeSaudacao.charAt(0));
        System.out.println("Subtring: " + testeSaudacao.substring(0, 5));
        System.out.println("Em Minúsculas: " + testeSaudacao.toLowerCase());
        System.out.println("Em Maiúsculas: " + testeSaudacao.toUpperCase());
        System.out.println("Contém 'mundo': " + testeSaudacao.contains("mundo"));
        System.out.println("Substituição: " + testeSaudacao.replace("mundo", "Java"));

        /* Neste exemplo, várias operações comuns em strings são demonstradas, mostrando
        como a classe String pode ser utilizada para manipular texto em Java.*/
    }
}
