package pesquisacommap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public double calcularEstoqueTotal(){
        double total = 0;
        for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
            total += entry.getValue().getPreco() * entry.getValue().getQuantidade();
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maior = 0;
        for (Produto p: produtosMap.values()) {
            if(p.getPreco() > maior){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menor = Double.MAX_VALUE;
        for (Produto p: produtosMap.values()) {
            if(p.getPreco() < menor){
                menor = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        int maior = 0;
        double total = 0;
        for (Produto p: produtosMap.values()) {
            if(p.getQuantidade() > maior){
                maior = p.getQuantidade();
                total = p.getPreco() * p.getQuantidade();
                produtoMaiorQuantidadeValorTotalNoEstoque = p;
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1L,"Camiseta", 10, 20.0);
        estoque.adicionarProduto(2L,"Calça", 20, 30.0);
        estoque.adicionarProduto(3L,"Bermuda", 30, 40.0);
        estoque.adicionarProduto(4L,"Short", 3, 50.0);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: " + estoque.calcularEstoqueTotal());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade e valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
