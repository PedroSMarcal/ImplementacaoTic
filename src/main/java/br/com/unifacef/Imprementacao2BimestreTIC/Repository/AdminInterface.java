package br.com.unifacef.Imprementacao2BimestreTIC.Repository;

import br.com.unifacef.Imprementacao2BimestreTIC.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminInterface extends JpaRepository<Admin, Long> {
}
