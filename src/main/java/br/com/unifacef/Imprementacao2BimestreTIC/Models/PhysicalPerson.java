package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "PhysicaPerson")
public class PhysicalPerson extends Clients implements Serializable {
    public static final long serialVersionUID = 5611841125433680679L;

    @Id
    private int code;
    private String cpf;
}
