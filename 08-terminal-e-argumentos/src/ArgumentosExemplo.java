public class ArgumentosExemplo {
    public static void main(String[] args) {
        // Exemplo do que foi visto no "MaterialEstudo.ipynb"

        // Os argumentos começam com indice 0!
        String nome = args[0]; //Acessa o primeiro argumento passado (índice 0) e o armazena na variável nome.
        String sobrenome = args[1]; //Acessa o segundo argumento (índice 1) e o armazena na variável sobrenome.
        int idade = Integer.valueOf(args[2]); //Acessa o terceiro argumento (índice 2) e o converte de String para int usando Integer.valueOf. 
        double altura = Double.valueOf(args[3]); //Acessa o quarto argumento (índice 3) e o converte de String para double usando Double.valueOf.

        System.out.println("Argumentos:");
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
