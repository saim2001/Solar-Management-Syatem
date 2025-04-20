package com.solarsystem.solar_management_system.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.ACTIVE;

    @CreatedDate
    @Column(nullable = false, updatable = false,columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant updatedAt;

    @Column(columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private Instant deletedAt;

    @CreatedBy
    @Column(updatable = false)
    private UUID createdBy;

    @LastModifiedBy
    @Column
    private UUID updatedBy;

    @Column
    private UUID deletedBy;

    public enum Status{
        ACTIVE,
        INACTIVE,
        DELETED
    }

    public void softDelete(UUID deletedByUserId){
        this.status = Status.DELETED;
        this.deletedAt = Instant.now();
        this.deletedBy = deletedByUserId;
    }




}
