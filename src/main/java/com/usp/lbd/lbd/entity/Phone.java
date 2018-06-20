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
@Table(name = "TELEFONE")
public class Phone extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_PESSOA")
    private UID personId;

    @Id
    @Column(name = "NUMERO")
    private String number;

    @Id
    @Column(name = "TIPO")
    private int type;
}
