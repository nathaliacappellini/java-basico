public class AnatomiaClasses {
    public static void main(String[] args) throws Exception {

    //Uma breve descrição sobre a Anatomia das Classes:
        
        //Declaração do pacote:

            package com.example;
        

        //Importações (se necessário):

            import java.util.Date;
        

        //Definição da classe:

            public class pessoa{
            }


        //Atributos (ou campos) da classe:

            private String nome;
            private int idade;
            private Date dataDeNascimento;
        

        //Construtor padrão (sem argumentos):

            public Pessoa() {
            }
        

        //Construtor com argumentos:

            public Pessoa(String nome, int idade, Date dataDeNascimento) {{
                
                this.nome = nome;
                this.idade = idade;
                this.dataDeNascimento = dataDeNascimento;
            }}
            

        //Métodos getter e setter (encapsulamento):

            public String getNome() {{
                return nome;
            }}
        
            public void setNome(String nome) {{
                this.nome = nome;
            }}
        
            public int getIdade() {{
                return idade;
            }}
        
            public void setIdade(int idade) {{
                this.idade = idade;
            }}
        
            public Date getDataDeNascimento() {{
                return dataDeNascimento;
            }}
        
            public void setDataDeNascimento(Date dataDeNascimento) {{
                this.dataDeNascimento = dataDeNascimento;
            }}
        

        //Método de instância (comportamento):

            public void mostrarDetalhes() {{
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Data de Nascimento: " + dataDeNascimento);
            }}
        

        //Método estático:

            public static void mostrarMensagem() {{
                System.out.println("Olá! Este é um método estático da classe Pessoa.");
            }}   
    }
}
