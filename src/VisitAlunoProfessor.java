class Visitante extends Pessoa {
    public Visitante(String cpf, String nome, int idade) {
        super(cpf,nome,idade);
    }
}

class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String cpf, String nome, int idade, int matricula) {
        super(cpf,nome,idade); //mostra atributos da superclasse Pessoa
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga pelo aluno " + getNome());
    }
}

class Professor extends Pessoa {
    private String centro;

    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf,nome, idade);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula() {
        System.out.println("Aula dada pelo professor " + getNome());
    }
}

class Bolsista extends Aluno {
    public Bolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + "é aluno bolsista. Mensalidade paga");
    }
}

class Regular extends Aluno {
    public Regular(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + "é aluno regular. Mensalidade paga.");
    }
}
