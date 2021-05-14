package br.com.unifacef.Imprementacao2BimestreTIC.Models;

import java.util.Date;

public class Pessoa {
    private String name;
    private String cellphone;
    private Date createdAt;

    //CONSTRUCTORS
    public Pessoa(){}

    public Pessoa(String name, String cellphone, Date createdAt) {
        this.setName(name);
        this.setCellphone(cellphone);
        this.setCreatedAt(createdAt);
    }

    //SETTERS
    public final void setName(String name) {
        this.name = name;
    }

    public final void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public final void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    //GETTERS

    public String getName() {
        return this.name;
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }
}
