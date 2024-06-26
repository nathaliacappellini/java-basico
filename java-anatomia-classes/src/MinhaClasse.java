public class MinhaClasse {
    
public static void main (String [] args) {
    
    //Definindo variáveis com valores para os nomes
    String primeiroNome = "Nathalia";
    String segundoNome = "Cappellini";

    //Chamada de um método sendo atribuído a uma variável
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    //Resultado da concatenação sendo printado 
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    //Podemos concatenar usando o "+" ou o ".concat"
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
