package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

   private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l: livroLista){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
      CatalogoLivros livros = new CatalogoLivros();
      livros.adicionarLivro("Viagem ao Centro da Terra", "Julio Vernert", 1990);  
      livros.adicionarLivro("Zine Death Metal", "Andrêy Ferraz", 2008);  
      livros.adicionarLivro("A Ilha Perdida", "Maria Jose Dupré", 2001);  
      livros.adicionarLivro("Dom Quixote", "Juan Pablo", 1980);  
      livros.adicionarLivro("Heavy Metal", "Rod Stewart", 2015);  
    
      System.out.println(livros.livroLista);
      System.out.println(livros.pesquisarPorAutor("Andrêy Ferraz"));
      System.out.println(livros.pesquisarPorIntervaloAnos(1970, 1991));
      System.out.println(livros.pesquisaPorTitulo("Heavy Metal"));
    
    }


    
}
