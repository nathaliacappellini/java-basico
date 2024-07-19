import java.util.Scanner;

public class ScannerExemplo {
    public static void main(String[] args) {
        // Criação do objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo uma String
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        // Lendo um inteiro
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        // Lendo um double
        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        // Lendo um boolean
        System.out.println("Você gosta de Java? (true/false)");
        boolean gostaDeJava = scanner.nextBoolean();

        // Exibindo os dados lidos
        System.out.println("//////////////////////"); // Isso é apenas para separar o resultado do resto :')
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Gosta de Java: " + gostaDeJava);

        // Fechando o scanner
        scanner.close();
    }
}
