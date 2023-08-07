package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas testandoLista = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: "+ testandoLista.obterNumeroTotalTarefas());

        testandoLista.adicionarTarefa("Tarefa 1");
        testandoLista.adicionarTarefa("Tarefa 2");
        testandoLista.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: "+ testandoLista.obterNumeroTotalTarefas());

        testandoLista.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: "+ testandoLista.obterNumeroTotalTarefas());

        testandoLista.obterDescricoesTarefas();
    }

}
