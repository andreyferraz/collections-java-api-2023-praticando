package operacoesbasicascomset;

import java.util.Set;
import java.util.HashSet;
public class ConjuntoPalavrasUnicas {

    private Set<PalavrasUnicas> palavraSet;
    
    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(new PalavrasUnicas(palavra));
    }
    
    public void removerPalavra(String palavra) {
        PalavrasUnicas palavraUnica = null;
        for (PalavrasUnicas p : palavraSet) {
            if (p.getPalavra().equals(palavra)) {
                palavraUnica = p;
                break;
            }
        } 
        palavraSet.remove(palavraUnica);           
    }
    
    public boolean verificarPalavra(String palavra) {
        return palavraSet.contains(new PalavrasUnicas(palavra));
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("André");
        conjuntoPalavrasUnicas.adicionarPalavra("Mateus");
        conjuntoPalavrasUnicas.adicionarPalavra("Abobora");
        conjuntoPalavrasUnicas.removerPalavra("Mateus");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("Existe a palavra abobora? "+ conjuntoPalavrasUnicas.verificarPalavra("André"));
    }
}
