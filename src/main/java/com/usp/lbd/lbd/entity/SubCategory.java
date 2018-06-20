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
@Table(name = "SUBCATEGORIA")
public class SubCategory extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_SUBCATEGORIA")
    private UID subCategoryId;

    @Column(name = "ID_CATEGORIA")
    private UID categoryId;

    @Column(name = "NOME")
    private String name;

}
