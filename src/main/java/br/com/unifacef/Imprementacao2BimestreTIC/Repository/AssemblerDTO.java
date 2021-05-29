package br.com.unifacef.Implementacao.Repository;

import br.com.unifacef.Implementacao.models.Assembler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssemblerDTO extends JpaRepository<Assembler, Long> {
}
