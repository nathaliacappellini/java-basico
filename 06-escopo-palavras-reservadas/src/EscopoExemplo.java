public class EscopoExemplo {

    // Escopo de Classe (variável de instância)
    private int variavelInstancia = 10;

    // Escopo de Classe (variável de classe/estática)
    private static int variavelClasse = 20;

    public void exemploEscopoMetodo(int parametro) { // Escopo de Método (parâmetro)
        // Escopo de Método (variável local)
        int variavelLocal = 30;

        // Escopo de Bloco
        if (parametro > 0) {
            // Variável de escopo de bloco
            int variavelBloco = 40;
            System.out.println("Variável de Bloco: " + variavelBloco);
        }

        // Escopo de Bloco: A variável variavelBloco não é acessível aqui
        // System.out.println(variavelBloco); <- Isso causaria um erro de compilação

        // Usando variáveis de diferentes escopos
        System.out.println("Variável de Instância: " + variavelInstancia);
        System.out.println("Variável de Classe: " + variavelClasse);
        System.out.println("Variável Local: " + variavelLocal);
        System.out.println("Parâmetro: " + parametro);
    }

    public static void main(String[] args) {
        EscopoExemplo exemplo = new EscopoExemplo();
        exemplo.exemploEscopoMetodo(5);
    }

    /* Quando o método exemploEscopoMetodo é chamado com o valor 5, a saída será:
     * 
     *  Variável de Bloco: 40
     *  Variável de Instância: 10
     *  Variável de Classe: 20
     *  Variável Local: 30
     *  Parâmetro: 5
     * 
     */
}

