package ordenacaocomset;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        this.alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        this.alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("André", 123456, 9.5);
        gerenciadorAlunos.adicionarAluno("Mateus", 123457, 7.5);
        gerenciadorAlunos.adicionarAluno("Bernardo", 123458, 8);
        System.out.println("Lista de alunos: ");
        gerenciadorAlunos.exibirAlunos();

        System.out.println("Removendo aluno: ");
        gerenciadorAlunos.removerAluno(123456);
        System.out.println(gerenciadorAlunos.alunosSet);

        System.out.println("Alunos em ordem dos nomes: ");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("Alunos por nota: ");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    
    }
}
