public class VariaveisTipos {
    public static void main(String[] args) {
        //Teste do que foi visto em "Variáveis e Tipos de Dados" no material de estudo... Este programa cria e inicializa várias variáveis, e então imprime seus valores. 

        // Tipos primitivos
        int idade = 25;
        double salario = 2500.75;
        boolean empregado = true;
        char inicial = 'N';

        // Tipos referenciados
        String nome = "Nathalia";
        int[] numeros = {1, 2, 3, 4, 5};

        // Exibindo valores
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Empregado: " + empregado);
        System.out.println("Inicial: " + inicial);
        System.out.println("Nome: " + nome);
        System.out.print("Números: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    } 
}
