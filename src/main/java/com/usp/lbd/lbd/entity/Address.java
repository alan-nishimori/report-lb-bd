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
@Table(name = "ENDERECO")
public class Address extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_ENDERECO")
    private UID id;

    @Column(name = "CIDADE")
    private String city;

    @Column(name = "ESTADI")
    private String state;

    @Column(name = "PAIS")
    private String country;

}
