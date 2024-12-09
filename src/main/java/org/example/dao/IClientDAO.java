package org.example.dao;

import org.example.domain.Client;

public interface IClientDAO {
    void salvar(Client client);

    Client buscarPorCPF(Long cpf);

    void excluir(Client cpf);

    void alterar(Client client);
}
