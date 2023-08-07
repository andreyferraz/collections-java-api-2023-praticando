package operacoesbasicas;

public class Tarefa {

    private String descricao;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    //conversão para exibir a lista como string 
    @Override
    public String toString() {
        return descricao;
    }
}
