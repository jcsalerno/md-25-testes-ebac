package org.example.services;

import org.example.dao.IClientDAO;
import org.example.domain.Client;

public class ClientService implements IClientService {

    private final IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public void salvar(Client client) {
        clientDAO.salvar(client);
    }

    @Override
    public Client buscarPorCPF(Long cpf) {
        return clientDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Client cpf) {
        clientDAO.excluir(cpf);

    }

    @Override
    public void alterar(Client client) {
        clientDAO.alterar(client);
    }
}
