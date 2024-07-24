public class RepeticoesExemplo {
    public static void main(String[] args) {

        // Exemplo de for
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("/////////////"); // Isso é apenas para separar no terminal

        // Exemplo de for com array
        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + " = " + numeros[i]);
        }

        System.out.println("/////////////"); // Isso é apenas para separar no terminal

        // Exemplo de for-each
        int[] numeros2 = { 10, 20, 30, 40, 50 };

        for (int numero : numeros2) {
            System.out.println("Número = " + numero);
        }

        System.out.println("/////////////"); // Isso é apenas para separar no terminal

        // Exemplo de while
        int contador = 0;
        while (contador < 5) {
            System.out.println("contador = " + contador);
            contador++;
        }

        System.out.println("/////////////"); // Isso é apenas para separar no terminal

        // Exemplo de do-while
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 5);
    }
}
