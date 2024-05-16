//  Questão 1: Classes e Objetos: Crie uma classe abstrata chamada
// “Pessoa” que represente um ser humano. Pessoa deve ter atributos
//como “cpf”, “nome” e “idade”. Implemente os métodos para definir e
//obter esses atributos.


abstract class Pessoa {
    private String cpf; // declaração de variaveis
    private String nome;
    private int idade;

    public Pessoa(String cpf, String nome, int idade, Date dataNascimento) {
        this.cpf = cpf; // especificar que esses atributos referem-se a essa classe
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() { // getters e setters
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
    }


}

// Questão 2: Encapsulamento e Métodos: Evolua a classe “Pessoa”
//adicionando um método público para incrementar a idade da
//pessoa. Crie um método público chamado “fazerAniversario”.
