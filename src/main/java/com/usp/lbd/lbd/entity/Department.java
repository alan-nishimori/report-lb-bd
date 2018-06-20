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
@Table(name = "DEPARTAMENTO")
public class Department extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_DEPARTAMENTO")
    private UID departmentId;

    @Column(name = "NOME")
    private String name;

    @Column(name = "GRUPO")
    private String group;

}
