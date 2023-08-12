package pesquisacomset;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;
    
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefaSet.add(tarefa);
    }
    
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("Lista vazia");
        }
    }    
        
    

    public void exibirTarefas() {
        for (Tarefa t : tarefaSet) {
            System.out.println(t);
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isFinalizado()) {
                tarefasConcluidas.add(t);
            }
        }
        System.out.println(tarefasConcluidas);
        return tarefasConcluidas;
    }
    
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isFinalizado()) {
                tarefasPendentes.add(t);
            }
        }
        System.out.println(tarefasPendentes);
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFinalizado(true);
            }
        }     
    }
    
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            tarefaParaMarcarComoPendente.setFinalizado(true);
            System.out.println("Tarefa marcada como pendente: "+ tarefaParaMarcarComoPendente.getDescricao());
        }else{
            System.out.println("Tarefa não encontrada na lista");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa(new Tarefa("Estudar", true));
        listaTarefas.adicionarTarefa(new Tarefa("Fazer exercícios", true));
        listaTarefas.adicionarTarefa(new Tarefa("Academia", false));
        listaTarefas.adicionarTarefa(new Tarefa("Ler", false));
        listaTarefas.adicionarTarefa(new Tarefa("Jogar", false));
        listaTarefas.adicionarTarefa(new Tarefa("Conserta Lampanda", false));
        listaTarefas.adicionarTarefa(new Tarefa("Sair pra Jantar", false));

        listaTarefas.exibirTarefas();

        System.out.println("Removendo a tarefa 'Academia'");
        listaTarefas.removerTarefa("Academia");
        listaTarefas.exibirTarefas();

        System.out.println("Quantidade de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas concluídas:");
        listaTarefas.obterTarefasConcluidas();

        System.out.println("Tarefas pendentes:");
        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaConcluida("Ler");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaPendente("Estudar");
        System.out.println("Tarefas atualizadas: ");
        listaTarefas.exibirTarefas();

    }

}
