package org.example.dao;

import org.example.domain.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientDAOMock implements IClientDAO {
    private Map<Long, Client> database = new HashMap<>();

    @Override
    public void salvar(Client client) {
        database.put(client.getCpf(), client);
    }

    @Override
    public Client buscarPorCPF(Long cpf) {
        return database.get(cpf);
    }

    @Override
    public void excluir(Client client) {
        database.remove(client.getCpf()); // Remove o cliente com base no CPF.
    }

    @Override
    public void alterar(Client client) {
        if (database.containsKey(client.getCpf())) {
            database.put(client.getCpf(), client); // Atualiza os dados do cliente.
        }
    }
}
