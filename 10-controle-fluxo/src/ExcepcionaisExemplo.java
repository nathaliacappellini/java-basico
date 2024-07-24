// Exceção personalizada
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public class ExcepcionaisExemplo {
    public static void main(String[] args) {

        // Bloco Try, Catch e Finally
        try {
            metodoQuePodeLancarExcecao();
        } catch (MinhaExcecao e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado");
        }
    }

    // Método que pode lançar exceção
    public static void metodoQuePodeLancarExcecao() throws MinhaExcecao {
        throw new MinhaExcecao("Ocorreu um erro");
    }
}