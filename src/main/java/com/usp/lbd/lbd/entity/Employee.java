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
@Table(name = "EMPREGADO")
public class Employee extends Auditable implements Serializable {

    @Id
    @Column(name = "DOCUMENTO")
    private String document;

    @Column(name = "ID_PESSOA")
    private UID personId;

    @Column(name = "FUNCAO")
    private String function;

    @Column(name = "DATA_CONTRATACAO")
    private Date employmentDate;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "ESTADO_CIVIL")
    private char civilState;

    @Column(name = "SEXO")
    private char gender;

    @Column(name = "DATA_NASCIMENTO")
    private Date birthDate;

}
