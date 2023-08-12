package pesquisacomset;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        for (Contato c : contatoSet) {
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarTelefoneContato(String nome, int novoTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 12345678);
        agendaContatos.adicionarContato("Juninho", 98765432);
        agendaContatos.adicionarContato("Maria", 98765432);
        agendaContatos.adicionarContato("Maria do Carmo", 765432);
        agendaContatos.adicionarContato("Maria da Silva", 98765432);
        agendaContatos.adicionarContato("Maria de Lima", 98765432);

        System.out.println("Lista da agenda: ");
        agendaContatos.exibirContatos();

        System.out.println("Resultado da pesquisa por nome: " + agendaContatos.pesquisarPorNome("Maria"));

        System.out.println("Atualizando telefone do contato Maria: " + agendaContatos.atualizarTelefoneContato("Maria", 987654321));
    }
}
