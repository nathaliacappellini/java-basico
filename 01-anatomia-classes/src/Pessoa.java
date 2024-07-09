public class Pessoa {
    //Teste da Classe Pessoa que foi visto no Material de Estudo...

    //Atributos
    private String nome;
    private int idade;

    //Construtor
    public Pessoa(String nome, int idade) {  

        this.nome = nome;
        this.idade = idade;

    }
    
    //Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método para imprimir detalhes da Pessoa
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    //Método Main
    public static void main(String[] args) {
        //Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Nathalia", 25);

        //Usando os métodos da classe
        pessoa.imprimirDetalhes();

        //Alterando os atributos
        pessoa.setNome("Nathi");
        pessoa.setIdade(26);

        //Imprimindo os novos detalhes
        pessoa.imprimirDetalhes();
    }
}
