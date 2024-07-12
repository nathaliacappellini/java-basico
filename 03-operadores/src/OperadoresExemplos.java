public class OperadoresExemplos {
    public static void main(String[] args) {

        // Operadores Aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;          // 15
        int subtracao = a - b;     // 5
        int multiplicacao = a * b; // 50
        int divisao = a / b;       // 2
        int modulo = a % b;        // 0

        // Operadores Unários
        int c = +a;  // 10
        int d = -b;  // -5
        a++;         // a agora é 11
        b--;         // b agora é 4

        // Operadores de Igualdade e Relacionais
        boolean igual = (a == b);      // false
        boolean diferente = (a != b);  // true
        boolean maiorQue = (a > b);    // true
        boolean menorQue = (a < b);    // false
        boolean maiorOuIgual = (a >= b); // true
        boolean menorOuIgual = (a <= b); // false

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        boolean eLogico = x && y;  // false
        boolean ouLogico = x || y; // true
        boolean naoLogico = !x;    // false

        // Operadores de Atribuição
        int e = 10;
        e += 5; // 15
        e -= 3; // 12
        e *= 2; // 24
        e /= 4; // 6
        e %= 3; // 0

        // Operadores Bitwise
        int f = 5;  // 0101 em binário
        int g = 3;  // 0011 em binário
        int andBitwise = f & g;   // 0001, que é 1
        int orBitwise = f | g;    // 0111, que é 7
        int xorBitwise = f ^ g;   // 0110, que é 6
        int notBitwise = ~f;      // 1010, que é -6 (em complemento a dois)
        int deslocEsq = f << 1;   // 1010, que é 10
        int deslocDir = f >> 1;   // 0010, que é 2
        int deslocDirSemSinal = f >>> 1; // 0010, que é 2

        // Operador Ternário
        int maior = (a > b) ? a : b; // 11, porque a é maior que b

        // Imprimindo os resultados
        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        System.out.println("Operadores Unários:");
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
        System.out.println("Valor de a após incremento: " + a);
        System.out.println("Valor de b após decremento: " + b);

        System.out.println("Operadores de Igualdade e Relacionais:");
        System.out.println("a é igual a b: " + igual);
        System.out.println("a é diferente de b: " + diferente);
        System.out.println("a é maior que b: " + maiorQue);
        System.out.println("a é menor que b: " + menorQue);
        System.out.println("a é maior ou igual a b: " + maiorOuIgual);
        System.out.println("a é menor ou igual a b: " + menorOuIgual);

        System.out.println("Operadores Lógicos:");
        System.out.println("x e y: " + eLogico);
        System.out.println("x ou y: " + ouLogico);
        System.out.println("não x: " + naoLogico);

        System.out.println("Operadores de Atribuição:");
        e = 10; // resetando valor de e
        e += 5;
        System.out.println("Valor de e após +=: " + e);
        e = 10; // resetando valor de e
        e -= 3;
        System.out.println("Valor de e após -=: " + e);
        e = 10; // resetando valor de e
        e *= 2;
        System.out.println("Valor de e após *=: " + e);
        e = 10; // resetando valor de e
        e /= 4;
        System.out.println("Valor de e após /=: " + e);
        e = 10; // resetando valor de e
        e %= 3;
        System.out.println("Valor de e após %=: " + e);

        System.out.println("Operadores Bitwise:");
        System.out.println("AND Bitwise: " + andBitwise);
        System.out.println("OR Bitwise: " + orBitwise);
        System.out.println("XOR Bitwise: " + xorBitwise);
        System.out.println("NOT Bitwise: " + notBitwise);
        System.out.println("Deslocamento à esquerda: " + deslocEsq);
        System.out.println("Deslocamento à direita: " + deslocDir);
        System.out.println("Deslocamento à direita sem sinal: " + deslocDirSemSinal);

        System.out.println("Operador Ternário:");
        System.out.println("Maior valor entre a e b: " + maior);
    
    }
}

