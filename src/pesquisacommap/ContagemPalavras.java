package pesquisacommap;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        this.contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void encontrarPalavraMaisFrequente(){
        int maior = 0;
        String palavraMaisFrequente = "";
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if(entry.getValue() > maior){
                maior = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        System.out.println("Palavra mais frequente: " + palavraMaisFrequente);
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("teste", 2);
        contagemPalavras.adicionarPalavra("amor", 3);
        contagemPalavras.adicionarPalavra("computador", 1);
        contagemPalavras.adicionarPalavra("teclado", 8);
        contagemPalavras.adicionarPalavra("mouse", 4);
        contagemPalavras.adicionarPalavra("computador", 12);
        contagemPalavras.adicionarPalavra("casa", 4);
        contagemPalavras.removerPalavra("casa");
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}
