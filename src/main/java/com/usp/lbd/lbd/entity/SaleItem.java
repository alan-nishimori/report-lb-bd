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
@Table(name = "ITEMVENDA")
public class SaleItem extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_ITEM")
    private UID itemId;

    @Column(name = "ID_VENDA")
    private UID sellId;

    @Column(name = "ID_PRODUTO")
    private UID productId;

    @Column(name = "CODIGO_RASTREIO")
    private String trackingCode;

    @Column(name = "QUANTIDADE_ESTOQUE")
    private int stockQuantity;

    @Column(name = "PRECO_UNITARIO")
    private float unitaryPrice;

    @Column(name = "DESCONTO")
    private float discount;

    @Column(name = "TOTAL_ITEM")
    private int itemTotal;

}
