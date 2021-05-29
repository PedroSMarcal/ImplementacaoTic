package br.com.unifacef.Implementacao.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "ClientsRequest")
public class ClientsRequest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private Clients clients;
    private int actual_status, actual_process, number;
    private String title, description, cep, street, neighborhood, city, uf, country, installationEnvironments, paymentWay;
    private Date startDate, finalDate, previsionFinalDate;
    private Float grossAmount, netValue;
}
