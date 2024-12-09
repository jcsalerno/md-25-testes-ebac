package org.example.services;

import org.example.domain.Client;

public interface IClientService {
    void salvar(Client client);

    Client buscarPorCPF(Long cpf);

    void excluir(Client cpf);

    void alterar(Client client);
}
