package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "LegalPerson")
public class LegalPerson extends Clients implements Serializable {
    public static final long serialVersionUID = 3241103317484245230L;

    @Id
    private int code;
    private String cnpj;
}
