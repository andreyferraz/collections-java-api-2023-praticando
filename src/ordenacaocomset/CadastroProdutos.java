package ordenacaocomset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "Bola", 10.0, 10);
        cadastroProdutos.adicionarProduto(2, "Computador", 5000.0, 3);
        cadastroProdutos.adicionarProduto(3, "Celular", 500.0, 5);
        cadastroProdutos.adicionarProduto(4, "Adaga", 30.0, 2);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Produtos organizados por preço: ");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
