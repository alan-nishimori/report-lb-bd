package com.usp.lbd.lbd.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Builder()
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VENDA")
public class Sell extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_VENDA")
    private UID sellId;

    @Column(name = "ID_CLIENTE")
    private UID clientId;

    @Column(name = "ID_VENDEDOR")
    private UID sellerId;

    @Column(name = "DATA_VENDA")
    private Date sellDate;

    @Column(name = "DATA_VENCIMENTO")
    private Date expirationDate;

    @Column(name = "Status")
    private int status;

    @Column(name = "SUBTOTAL")
    private int subtotal;

    @Column(name = "CODIGO_APROVACAO_CARTAO")
    private String cardAprovationToken;

    @Column(name = "DATA_ENVIO")
    private Date sendDate;

    @Column(name = "VALOR_FRETE")
    private float shippingCost;

    @Column(name = "TOTAL")
    private float total;

}
