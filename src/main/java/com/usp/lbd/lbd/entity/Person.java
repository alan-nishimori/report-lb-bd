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
@Table(name = "PESSOA")
public class Person extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_PESSOA")
    private UID id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "SENHA")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ID_ENDERECO")
    private UID address;

}
