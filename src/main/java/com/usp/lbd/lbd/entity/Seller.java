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
@Table(name = "VENDEDOR")
public class Seller extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_PESSOA")
    private UID person_id;

    @Column(name = "BONUS")
    private float bonus;

    @Column(name = "COMISSAO")
    private float commission;

    @Column(name = "VENDAS_ANO")
    private float yearSelling;

    @Column(name = "VENDAS_ANO_ANTERIOR")
    private float lastYearSelling;

    @Column(name = "COTA_VENDAS")
    private float sellingQuota;

}
