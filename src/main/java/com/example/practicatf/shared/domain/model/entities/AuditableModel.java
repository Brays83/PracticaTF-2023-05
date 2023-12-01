package com.isa.platform.u20211f984.shared.domain.model.entities;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Data
public class AuditableModel {
    //Agregar COLUMNAS QUE TIENEN TODOS
    /*
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;*/

}
