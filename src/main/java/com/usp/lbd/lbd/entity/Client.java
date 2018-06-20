package com.usp.lbd.lbd.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.rmi.server.UID;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Builder()
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENTE")
public class Client extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_CLIENTE")
    private UID client;

    @Column(name = "ID_PESSOA")
    private UID personId;

    @Column(name = "CARTAO_TIPO")
    private String cardType;

    @Column(name = "CARTAO_NUMERO")
    private String cardNumber;

    @Column(name = "CARTAO_VALIDADE_MES")
    private int cardMonth;

    @Column(name = "CARTAO_VALIDADE_ANO")
    private int cardYear;

}
