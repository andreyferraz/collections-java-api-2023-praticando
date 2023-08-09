package odernacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Andrêy", 32, 1.82);
        ordenacaoPessoas.adicionarPessoa("Karine", 29, 1.62);
        ordenacaoPessoas.adicionarPessoa("Bernardes", 35, 1.50);

        System.out.println("Pessoas ordenadas por idade:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Pessoas ordenadas por altura:");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
