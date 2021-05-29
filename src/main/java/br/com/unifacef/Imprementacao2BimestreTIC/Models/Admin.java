package br.com.unifacef.Imprementacao2BimestreTIC.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Admin")
public class Admin extends Pessoa implements Serializable {
    public static final long serialVersionUID = 7045819192897741853L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String usuario;
    private String senha;
    private int quantidadeDeVendas;
    private float valorTotalProjetos;

    //CONSTRUCTORS
    public Admin() {
        super();
    }

    public Admin(String name, String cellphone, Date createdAt, String usuario, String senha, int quantidadeDeVendas, float valorTotalProjetos) {
        super(name, cellphone, createdAt);
        this.setUsuario(usuario);
        this.setSenha(senha);
        this.setQuantidadeDeVendas(quantidadeDeVendas);
        this.setValorTotalProjetos(valorTotalProjetos);
    }

    //SETTERS
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public void setValorTotalProjetos(float valorTotalProjetos) {
        this.valorTotalProjetos = valorTotalProjetos;
    }

    //GETTERS
    public String getUsuario() {
        return this.usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public int getQuantidadeDeVendas() {
        return this.quantidadeDeVendas;
    }

    public float getValorTotalProjetos() {
        return this.valorTotalProjetos;
    }
}
