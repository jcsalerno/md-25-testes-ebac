import dao.IClientDAOMock;
import org.example.dao.IClientDAO;
import org.example.domain.Client;
import org.example.services.ClientService;
import org.example.services.IClientService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientServiceTest {

    private static IClientService clientService;

    private Client client;

    public ClientServiceTest() {
        IClientDAO dao = new IClientDAOMock();
        clientService = new ClientService(dao);
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



    }

    @Test
    public void pesquisarClient(){

        Client clientConsultado = clientService.buscarPorCPF(client.getCpf());

        Assertions.assertNotNull(clientConsultado);
    }

    @Test
    public void salvarClient() {
        clientService.salvar(client);
    }

    @Test
    public void excluirClient(){
        client.setNome("Julio Cesar");
        clientService.excluir(client);

        Assertions.assertEquals("Julio Cesar", client.getNome());

    }
}
