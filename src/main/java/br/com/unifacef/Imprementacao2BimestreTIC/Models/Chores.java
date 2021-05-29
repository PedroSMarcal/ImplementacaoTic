package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

@Data
@Table(name = "Chores")
public class Chores implements Serializable {
    public static final long serialVersionUID = -7592411923146220139L;

    @Id
    private Long id;
    private Admin adminId;
    private boolean done;
    private String title;
    private String description;
    private Date chore_date;
    private Timer chore_time;
}
