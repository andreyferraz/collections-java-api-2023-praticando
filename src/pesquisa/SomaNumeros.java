package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosLista.add(new Numero(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        for (Numero n : numerosLista) {
            soma += n.getNumero();
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = 0;
        for (Numero n : numerosLista) {
            if (n.getNumero() > numeroMaior) {
                numeroMaior = n.getNumero();
            }
        }
        return numeroMaior;
    }

    public int encontrarMenorNumero() {
        int numeroMenor = Integer.MAX_VALUE;
        for (Numero n : numerosLista) {
            if (numeroMenor > n.getNumero()) {
                numeroMenor = n.getNumero();
            }
        }
        return numeroMenor;
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);

        System.out.println("Soma de todos os números informados: " + numeros.calcularSoma());
        System.out.println("Número maior da lista: " + numeros.encontrarMaiorNumero());
        System.out.println("Número menor da lista: " + numeros.encontrarMenorNumero());
        System.out.println("Lista de números: " + numeros.numerosLista);
    }

}
