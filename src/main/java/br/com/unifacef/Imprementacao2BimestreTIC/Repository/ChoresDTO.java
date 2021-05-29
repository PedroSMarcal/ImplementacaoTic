package br.com.unifacef.Implementacao.Repository;

import br.com.unifacef.Implementacao.models.Chores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoresDTO extends JpaRepository<Chores, Long> {
}
