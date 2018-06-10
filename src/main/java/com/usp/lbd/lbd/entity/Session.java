package com.usp.lbd.lbd.entity;

import com.usp.lbd.lbd.enumerator.Privileges;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "session")
public class Session extends Auditable implements Serializable {

    @Id
    @Column(name = "token", length = 40)
    private UUID token;

    @Enumerated(value = EnumType.STRING)
    private Privileges role;

    @Column(name = "user_id")
    private Long userId;
}
