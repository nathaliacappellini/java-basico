public class ClasseString {
    public static void main(String[] args) {

        //Exemplo do que foi visto sobre "Classe String" no material de estudo...

        String s1 = "Hello, World!";
        String s2 = "Hello, World!";
        String s3 = new String("Hello, World!");

        System.out.println("s1 == s2: " + (s1 == s2)); // verdadeiro, ambos se referem ao mesmo objeto no pool.
        System.out.println("s1 == s3: " + (s1 == s3)); // falso, s3 é um novo objeto.

        System.out.println("Length of s1: " + s1.length()); //Comprimento da String.
        System.out.println("Uppercase s1: " + s1.toUpperCase()); //Deixando toda a String em UpperCase.

        String s4 = s1.concat(" How are you?"); //Concatenação de duas Strings.
        System.out.println("Concatenated string: " + s4);

        String sub = s1.substring(7, 12); //Fazendo uma Substring.
        System.out.println("Substring of s1: " + sub);

        int index = s1.indexOf('o'); //Mostrando a primeira ocorrência do caractere "o" na String "s1", ele retorna a posição do primeiro "o". 
        System.out.println("Index of 'o' in s1: " + index);
        
    }
}
