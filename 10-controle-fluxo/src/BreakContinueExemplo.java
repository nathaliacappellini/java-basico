public class BreakContinueExemplo {
    public static void main(String[] args) {

        // Loop com Break
        for (int i = 0; i < 10; i++) {

            System.out.println("i: " + i);

            if (i == 5) {
                break; // interrompe o loop quando i é 5
            }
        }
        System.out.println("Loop com break terminado.");
        System.out.println("///////////////////");

        // Loop com Continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // pula a iteração atual se i for par
            }
            System.out.println("i: " + i); // será executado apenas para valores ímpares de i
        }
    }
}
