package operacoesbasicascommap;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String significado) {
        dicionarioMap.put(palavra, significado);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirDicionario() {
        for (Map.Entry<String, String> dicionario : dicionarioMap.entrySet()) {
            System.out.println(dicionario.getKey() + " - " + dicionario.getValue());
        }
    }

    public String buscarSignificado(String palavra) {
        return dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("teste1", "testando1");
        dicionario.adicionarPalavra("teste2", "testando2");
        dicionario.adicionarPalavra("teste3", "testando3");
        dicionario.adicionarPalavra("teste4", "testando4");
        dicionario.exibirDicionario();

        System.out.println("Buscar significado de teste1: "+dicionario.buscarSignificado("teste1"));

        System.out.println("Removendo a palavra teste4");
        dicionario.removerPalavra("teste4");
        dicionario.exibirDicionario();
    
    }
}
