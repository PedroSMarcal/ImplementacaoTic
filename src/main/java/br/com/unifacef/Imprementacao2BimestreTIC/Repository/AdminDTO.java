package br.com.unifacef.Implementacao.Repository;

import br.com.unifacef.Implementacao.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDTO extends JpaRepository<Admin, Long> {
}
