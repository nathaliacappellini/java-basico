/**
 * A classe `JavaDocExemplo` fornece métodos para realizar operações matemáticas
 * básicas.
 * 
 * @author Nathalia
 * @version 1.0
 */
public class JavaDocExemplo {

    // Na pasta "docs" foi gerado a documentação dessa classe

    /**
     * Adiciona dois números e retorna o resultado.
     * 
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return A soma dos dois números.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        JavaDocExemplo calc = new JavaDocExemplo();
        System.out.println("A soma de 2 e 3 é: " + calc.somar(2, 3));
    }
}
