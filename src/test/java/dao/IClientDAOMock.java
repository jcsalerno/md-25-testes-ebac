package dao;

import org.example.dao.IClientDAO;
import org.example.domain.Client;

import java.util.HashMap;
import java.util.Map;

public class IClientDAOMock implements IClientDAO {
    private static final Map<Long, Client> clientStore = new HashMap<>();

    @Override
    public void salvar(Client client) {
        clientStore.put(client.getCpf(), client);
    }

    @Override
    public Client buscarPorCPF(Long cpf) {
        return clientStore.get(cpf);
    }

    @Override
    public void excluir(Client cpf) {

    }

    @Override
    public void alterar(Client client) {

    }
}
