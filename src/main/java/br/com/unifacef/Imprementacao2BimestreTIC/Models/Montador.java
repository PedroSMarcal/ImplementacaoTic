package br.com.unifacef.Imprementacao2BimestreTIC.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Montador")
public class Montador extends Pessoa implements Serializable {
    public static final long serialVersionUID = -8705851087254646136L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String senha;
    private float valorTotalRecebido;
    private int qntdAtrazo;
    private boolean emServico;
    private int qntdProjetosInstaldos;

    //CONSTRUCTORS
    public Montador() {
        super();
    }

    public Montador(String name, String cellphone, Date createdAt, String usuario, String senha, float valorTotalRecebido, int qntdAtrazo, boolean emServico, int qntdProjetosInstaldos) {
        super(name, cellphone, createdAt);
        this.setUsuario(usuario);
        this.setSenha(senha);
        this.setValorTotalRecebido(valorTotalRecebido);
        this.setQntdAtrazo(qntdAtrazo);
        this.setEmServico(emServico);
        this.setQntdProjetosInstaldos(qntdProjetosInstaldos);
    }

    //SETTERS
    public final void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public final void setSenha(String senha) {
        this.senha = senha;
    }

    public final void setValorTotalRecebido(float valorTotalRecebido) {
        this.valorTotalRecebido = valorTotalRecebido;
    }

    public final void setQntdAtrazo(int qntdAtrazo) {
        this.qntdAtrazo = qntdAtrazo;
    }

    public final void setEmServico(boolean emServico) {
        this.emServico = emServico;
    }

    public final void setQntdProjetosInstaldos(int qntdProjetosInstaldos) {
        this.qntdProjetosInstaldos = qntdProjetosInstaldos;
    }

    public final void setId(Long id) {
        this.id = id;
    }

    // GETTERS
    public String getUsuario() {
        return this.usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public float getValorTotalRecebido() {
        return this.valorTotalRecebido;
    }

    public int getQntdAtrazo() {
        return this.qntdAtrazo;
    }

    public boolean isEmServico() {
        return this.emServico;
    }

    public int getQntdProjetosInstaldos() {
        return this.qntdProjetosInstaldos;
    }

    public Long getId() {
        return this.id;
    }
}
