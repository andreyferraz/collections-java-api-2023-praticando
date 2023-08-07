package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItems;

    public CarrinhoDeCompras() {
        this.listaItems = new ArrayList<>();
    }

    private void adicionarItem(String nome, double preco, int quantidade){
        listaItems.add(new Item(nome, preco, quantidade));
    }

    private void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: listaItems){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        listaItems.removeAll(itensParaRemover);
    }

    private double calcularValorTotal(){
        double valor = 0;
        for(Item i: listaItems){
            valor += i.getPreco() * i.getQuantidade();
        }
        return valor;
    }

    private void exibirItens(){
        System.out.println(listaItems);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras testandoCarrinho = new CarrinhoDeCompras();
        testandoCarrinho.adicionarItem("Camisa", 66.00, 1);
        testandoCarrinho.adicionarItem("Bone", 30.00, 2);
        testandoCarrinho.removerItem("Camisa");

        testandoCarrinho.exibirItens();

        System.out.println("Total do carrinho: " + testandoCarrinho.calcularValorTotal());
    }

}
