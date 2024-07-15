public class CalculadoraExemplo {

    // Aqui temos o exemplo sobre métodos que foi visto no "MaterialEstudo.ipynb"

    // Método sem parâmetros e sem retorno
    public void saudar() {
        System.out.println("Bem-vindo à calculadora!");
    }

    // Método com parâmetros e retorno de valor
    public int somar(int a, int b) {
        return a + b;
    }

    // Método estático
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método sobrecarregado (overloaded)
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para dividir dois números com verificação de divisão por zero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        // Criando uma instância da classe CalculadoraExemplo
        CalculadoraExemplo calculadora = new CalculadoraExemplo();

        // Chamando métodos da instância
        calculadora.saudar(); // Chama o método saudar

        int soma = calculadora.somar(5, 3); // Chama o método somar com int
        System.out.println("Soma: " + soma);

        double doubleSoma = calculadora.somar(2.5, 3.7); // Chama o método somar sobrecarregado com double
        System.out.println("Double Soma: " + doubleSoma);

        int diferença = calculadora.subtrair(10, 4); // Chama o método subtrair
        System.out.println("Diferença: " + diferença);

        double quociente = calculadora.dividir(10, 2); // Chama o método dividir
        System.out.println("Quociente: " + quociente);

        quociente = calculadora.dividir(10, 0); // Testa a verificação de divisão por zero
        System.out.println("Quociente: " + quociente);

        // Chamando método estático
        int produto = CalculadoraExemplo.multiplicar(4, 5); // Chama o método estático multiplicar
        System.out.println("Produto: " + produto);
    }
}

