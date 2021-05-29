package br.com.unifacef.Implementacao.Repository;

import br.com.unifacef.Implementacao.models.ClientsRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRequestDTO extends JpaRepository<ClientsRequest, Long> {
}
