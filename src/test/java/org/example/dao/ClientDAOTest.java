package org.example.dao;
import org.example.domain.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ClientDAOTest {

    private IClientDAO clientDAO;

    private Client client;

    public ClientDAOTest() {
        clientDAO = new ClientDAOMock();
    }

    @BeforeEach
    public void init() {
        client = new Client();
        client.setCpf(1472583601L);
        client.setNome("Julio");
        client.setCidade("Rio de Janeiro");
        client.setEnd("End");
        client.setEstado("RJ");
        client.setNumero(101);
        client.setTel(21999999999L);

        clientDAO.salvar(client);

    }
    @Test
    public void pesquisarClient() {
        Client clientConsultado = clientDAO.buscarPorCPF(client.getCpf());
        Assertions.assertNotNull(clientConsultado);
    }


    @Test
    public void excluirClient() {
        clientDAO.excluir(client);
        Client clientConsultado = clientDAO.buscarPorCPF(client.getCpf());
        Assertions.assertNull(clientConsultado);
    }


    @Test
    public void alterarClient() {
        client.setNome("Novo Nome");

        Client clientAlterado = clientDAO.buscarPorCPF(client.getCpf());
        Assertions.assertEquals("Novo Nome", clientAlterado.getNome());
    }
}