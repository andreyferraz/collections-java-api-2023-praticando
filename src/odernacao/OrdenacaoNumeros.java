package odernacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numeros> listaNumerosOrdenados;

    public OrdenacaoNumeros() {
        this.listaNumerosOrdenados = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumerosOrdenados.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente(){
        List<Numeros> numerosAscendentes = new ArrayList<>(listaNumerosOrdenados);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Numeros> ordenarDescendente(){
        List<Numeros> numerosDescendentes = new ArrayList<>(listaNumerosOrdenados);
        Collections.sort(numerosDescendentes, Collections.reverseOrder());
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();
        lista.adicionarNumero(8);
        lista.adicionarNumero(15);
        lista.adicionarNumero(66);
        lista.adicionarNumero(7);
        lista.adicionarNumero(28);

        System.out.println("Imprimindo todos os números da lista sem organizar: ");
        System.out.println(lista.listaNumerosOrdenados);

        System.out.println("Imprimindo números em ordem crescente: ");
        System.out.println(lista.ordenarAscendente());

        System.out.println("Imprimindo números em ordem decrescente: ");
        System.out.println(lista.ordenarDescendente());
    }
    
}
