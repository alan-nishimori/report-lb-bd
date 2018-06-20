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
@Table(name = "PRODUTO")
public class Product extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_PRODUTO")
    private UID productId;

    @Column(name = "ID_SUBCATEGORIA")
    private UID subCategoryId;

    @Column(name = "NOME")
    private String name;

    @Column(name = "NUMERO_PRODUTO")
    private String productNumber;

    @Column(name = "PRECO")
    private float price;

    @Column(name = "COR")
    private String color;

    @Column(name = "TAMANHO")
    private String size;

    @Column(name = "PESO")
    private float weight;

    @Column(name = "DESCRICAO")
    private String description;

    @Column(name = "QUANTIDADE")
    private int quantity;

    @Column(name = "MODELO")
    private String model;

    @Column(name = "DATA_ALTERACAO")
    private Date lastModification;

}
