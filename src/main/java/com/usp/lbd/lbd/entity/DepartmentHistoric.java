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
@Table(name = "HISTORICODEPARTAMENTO")
public class DepartmentHistoric extends Auditable implements Serializable {

    @Id
    @Column(name = "ID_PESSOA")
    private UID personId;

    @Id
    @Column(name = "ID_DEPARTAMENTO")
    private UID departmentId;

    @Id
    @Column(name = "DATA_ENTRADA")
    private Date entranceDate;

    @Column(name = "TURNO")
    private String shift;

    @Column(name = "DATA_SAIDA")
    private Date exitDate;

}
