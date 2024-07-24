public class CondicionaisExemplo {
    public static void main(String[] args) {

        // Exemplo de if-else
        int numero = 10;
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número não é positivo.");
        }

        // Exemplo de else-if
        int nota = 85;
        if (nota >= 90) {
            System.out.println("A nota é A.");
        } else if (nota >= 80) {
            System.out.println("A nota é B.");
        } else {
            System.out.println("A nota é C ou inferior.");
        }

        // Exemplo de switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia da semana");
                break;
        }
    }
}
