package pesquisacomset;

public class Tarefa {
    private String descricao;
    private boolean finalizado;
    
    public Tarefa(String descricao, boolean finalizado) {
        this.descricao = descricao;
        this.finalizado = finalizado;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "{ " + descricao + ", finalizado=" + finalizado + " }";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + (finalizado ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (finalizado != other.finalizado)
            return false;
        return true;
    }
}
