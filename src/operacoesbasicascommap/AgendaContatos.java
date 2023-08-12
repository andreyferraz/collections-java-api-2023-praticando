package operacoesbasicascommap;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        agendaContatosMap.remove(nome);
    }

    public Integer pesquisarPorNome(String nome){
        return agendaContatosMap.get(nome);
    }

    public void exibirContatos(){
        for (Map.Entry<String, Integer> contato : agendaContatosMap.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue());
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("André", 12345678);
        agendaContatos.adicionarContato("Maria", 98765432);
        agendaContatos.adicionarContato("João", 12345679);
        agendaContatos.adicionarContato("Pedro", 12345670);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisando por nome: " + agendaContatos.pesquisarPorNome("Maria"));

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

    }
    
}
