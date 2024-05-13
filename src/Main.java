public class Main {
    public static void main(String[] args) {
        // Criação de disciplinas
        Disciplina d1 = new Disciplina("DSC001", "PROGRAMAÇÃO ORIENT. OBJETOS", 1);
        Disciplina d2 = new Disciplina("DSC002", "RACIOCINIO LOGICO", 2);
        Disciplina d3 = new Disciplina("DSC003", "FUND. COMPUTAÇÃO", 3);

        // Criação de professor
        Professor professor = new Professor("123456789", "João", 40, "Centro de Ciências");

        // Criação de alunos
        Aluno aluno1 = new Regular("123123123", "Lázaro", 40, 24800931);
        Aluno aluno2 = new Regular("456456456", "José", 20, 24800930);
        Aluno aluno3 = new Bolsista("789789789", "Ana", 22, 24800935);

        // CRiação de visitantes
        Visitante visitante1 = new Visitante("111111111", "Paulo", 30);
        Visitante visitante2 = new Visitante("222222222", "Pedro", 26);

        // Criação de turmas
        Turma turma1 = new Turma("T01", d1, professor);
        Turma turma2 = new Turma("T02", d2, professor);
        Turma turma3 = new Turma("T03", d3, professor);

        // Add alunos nas turmas
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        // Imprimir informações
        System.out.println("Turma 1:");
        System.out.println("Código: " + turma1.getCodigo());
        System.out.println("Professor: " + turma1.getProfessor().getNome());
        System.out.println("Disciplina: " + turma1.getDisciplina().getNome());
        System.out.println("Alunos:");
        turma1.listarAlunos();
        System.out.println();

        System.out.println("Turma 2:");
        System.out.println("Código: " + turma2.getCodigo());
        System.out.println("Professor: " + turma2.getProfessor().getNome());
        System.out.println("Disciplina: " + turma2.getDisciplina().getNome());
        System.out.println("Alunos:");
        turma2.listarAlunos();
        System.out.println();

        System.out.println("Turma 3:");
        System.out.println("Código: " + turma3.getCodigo());
        System.out.println("Professor: " + turma3.getProfessor().getNome());
        System.out.println("Disciplina: " + turma3.getDisciplina().getNome());
        System.out.println("Alunos:");
        turma3.listarAlunos();
    }
}
