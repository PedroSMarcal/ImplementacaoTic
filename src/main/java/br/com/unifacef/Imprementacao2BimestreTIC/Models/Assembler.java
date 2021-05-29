package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "Assembler")
public class Assembler extends Users implements Serializable {
    public static long serialVersionUID = 4191476058285415484L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cellphone;
}
