package br.com.unifacef.Implementacao.models;

import lombok.Data;
import java.util.Date;

@Data
public class Clients {
    private int code;
    private boolean warn_contact;
    private String name;
    private String cellphone;
    private Date last_contact;
}
