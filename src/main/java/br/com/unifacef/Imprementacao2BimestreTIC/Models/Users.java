package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "Users")
public class Users implements Serializable {
    public static final long serialVersionUID = 1532017642213650569L;
    @Id
    private Long id;
    private String nome;
    private String users;
    private String password;
}
